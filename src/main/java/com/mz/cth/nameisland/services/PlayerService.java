package com.mz.cth.nameisland.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.cth.nameisland.interfaces.IPlayer;
import com.mz.cth.nameisland.model.Player;
import com.mz.cth.nameisland.modelEnums.PlayerStatus;

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

	public Optional<Player> findById(long playerId) {

		return iPlayer.findById(playerId);

		
	}
	public Player findByOne(long playerId) {

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
		Player LoggedPlayer = new Player();
		Player player = findByUsername(username);

		if (player.getPwd().equals(pwd)) {
			LoggedPlayer = player;

		}

		return LoggedPlayer;
	}

	public List<Player> findPlayersOnline() {

		return iPlayer.findPlayersOnline();

	}

	public boolean changeStatus(long id) {
		Player player = findByOne(id);
		boolean changed = false;

		if (player.getPlayerStatus().equals(PlayerStatus.Online)) {
			player.setPlayerStatus(PlayerStatus.Offline);
			changed = save(player);

		} else {

			player.setPlayerStatus(PlayerStatus.Online);
			changed = save(player);
		}

		return changed;

	}

}
