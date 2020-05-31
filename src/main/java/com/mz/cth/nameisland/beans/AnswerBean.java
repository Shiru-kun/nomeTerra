package com.mz.cth.nameisland.beans;

public class AnswerBean {


private long playerId;
private long gameId;
private long questioId;
private String answer;
public long getPlayerId() {
	return playerId;
}
public void setPlayerId(long playerId) {
	this.playerId = playerId;
}
public long getGameId() {
	return gameId;
}
public void setGameId(long gameId) {
	this.gameId = gameId;
}
public long getQuestioId() {
	return questioId;
}
public void setQuestioId(long questioId) {
	this.questioId = questioId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

}
