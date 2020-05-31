package com.mz.cth.nameisland.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private long playTimes;
    private long level;
    private int time;
    private long challengerId;
    private long challengedId;
    
    public long getChallengerId() {
		return challengerId;
	} 
	public void setChallengerId(long challengerId) {
		this.challengerId = challengerId;
	}
	public long getChallengedId() {
		return this.challengedId;
	}
	public void setChallengedId(long challengedId) {
		this.challengedId = challengedId;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	private LocalDateTime dataEntry;
	public long getId() {
		return id;
	} 
	public void setId(long id) {
		this.id = id;
	}
	public long getRound() {
		return playTimes;
	}
	public void setRound(long round) {
		this.playTimes = round;
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
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(long round, long level, int time) {
		super();
		this.playTimes = round;
		this.level = level;
		this.time= time;
		this.dataEntry = LocalDateTime.now();
	}
	public Game(long rounds, long level, int time, long challengerId, long challengedId) {
		super();
		this.playTimes = rounds;
		this.level = level;
		this.time = time;
		this.challengerId = challengerId;
		this.challengedId = challengedId;
	}
	  
    
}
