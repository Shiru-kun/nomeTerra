package com.mz.cth.nameisland.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private long round;
    private Long level;
    private LocalDateTime gameTime;
    private LocalDateTime dataEntry;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRound() {
		return round;
	}
	public void setRound(long round) {
		this.round = round;
	}
	
	public LocalDateTime getGameTime() {
		return gameTime;
	}
	public void setGameTime(LocalDateTime gameTime) {
		this.gameTime = gameTime;
	}
	public LocalDateTime getDataEntry() {
		return dataEntry;
	}
	public void setDataEntry(LocalDateTime dataEntry) {
		this.dataEntry = dataEntry;
	}
	public Long getLevel() {
		return level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}
    
}
