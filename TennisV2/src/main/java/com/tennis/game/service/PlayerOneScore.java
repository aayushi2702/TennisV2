package com.tennis.game.service;

import org.springframework.stereotype.Component;

@Component
public class PlayerOneScore {

	private int playerOneScore;

	public void playerOneScored() {
		playerOneScore++;
	}

	public int getPlayerOneScored() {
		return playerOneScore;
	}

	public void setScoreForPlayerOne(String playerOneScore) {
		this.playerOneScore = 0;
		for (int i = 0; i < Integer.parseInt(playerOneScore); i++) {
			playerOneScored();
		}
	}

}