package com.mz.cth.nameisland.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mz.cth.nameisland.model.Game;

public interface IGame extends JpaRepository<Game , Long> {
	

}
