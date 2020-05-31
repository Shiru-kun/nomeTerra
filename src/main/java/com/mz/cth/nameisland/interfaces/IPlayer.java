package com.mz.cth.nameisland.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mz.cth.nameisland.model.Player;

public interface IPlayer extends JpaRepository<Player, Long> {

public Player findByUsername(String username);
	
@Query(nativeQuery = true, value="select * from player where player_status='Online'")
public List<Player> findPlayersOnline();

}
