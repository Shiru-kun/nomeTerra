package com.mz.cth.nameisland.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mz.cth.nameisland.model.Game;

public interface IGame extends JpaRepository<Game, Long> {
	
	@Query
	(nativeQuery = true, value="select * from game where challenger_id= :id")
    public Game findGameByPlayer(@Param("id") long id);

} 
