package com.mz.cth.nameisland.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mz.cth.nameisland.model.Player;

public interface IPlayer extends JpaRepository<Player, Long> {

	Player findByUsername(String username);
	
	

}
