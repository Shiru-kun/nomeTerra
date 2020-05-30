package com.mz.cth.nameisland.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mz.cth.nameisland.modelEnums.PlayerStatus;
import com.mz.cth.nameisland.modelEnums.PlayerType;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String photoUrl;
	private String email;
	private long points;
	private String pwd;
	private LocalDateTime dataEntry;
	@Enumerated(EnumType.STRING)
	private PlayerStatus playerStatus;
	@Enumerated(EnumType.STRING)
	private PlayerType playerType;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public LocalDateTime getDataEntry() {
		return dataEntry;
	}
	public void setDataEntry(LocalDateTime dataEntry) {
		this.dataEntry = dataEntry;
	}
	public PlayerStatus getPlayerStatus() {
		return playerStatus;
	}
	public void setPlayerStatus(PlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}
	public PlayerType getPlayerType() {
		return playerType;
	}
	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Player(String username, String email, String pwd) {
		super();
		this.pwd = pwd;
		this.username = username;
		this.email = email;
		this.points = 0;
		this.playerStatus= PlayerStatus.Offline;
		this.dataEntry =LocalDateTime.now();
		
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
