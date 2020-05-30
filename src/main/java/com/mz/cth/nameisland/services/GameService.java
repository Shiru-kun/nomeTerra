package com.mz.cth.nameisland.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.cth.nameisland.interfaces.IGame;
import com.mz.cth.nameisland.model.Game;

@Service
public class GameService {

	@Autowired
	private IGame iGame;

	public boolean save(Game game) {

		try {
			iGame.save(game);
			return true;

		} catch (Exception e) {
			return false;// TODO: handle exception
		}

	}

	public boolean delete(Game game) {

		try {
			iGame.delete(game);
			return true;

		} catch (Exception e) {
			return false;// TODO: handle exception
		}

	}

	public Game findById(long gameId) {

		return iGame.getOne(gameId);
	}

	public List<Game> findAll() {

		return iGame.findAll();
	}

}
