package com.mz.cth.nameisland.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.cth.nameisland.interfaces.IPlayer;
import com.mz.cth.nameisland.model.Player;

@Service
public class PlayerService {

	@Autowired
	private IPlayer iPlayer;

	public boolean save(Player player) {

		try {
			iPlayer.save(player);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public Player findById(long playerId) {

		return iPlayer.getOne(playerId);

	}

	public List<Player> findAll() {

		return iPlayer.findAll();
	}

	public boolean delete(Player player) {

		try {
			iPlayer.delete(player);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public Player findByUsername(String username) {

		return iPlayer.findByUsername(username);
	}

	public Player login(String username, String pwd) {
		Player LoggedPlayer = null;
		Player player = findByUsername(username);
		if (player.getPwd().equals(pwd)) {
			LoggedPlayer = player;

		}

		return LoggedPlayer;
	}

}
