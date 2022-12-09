package com.tennis.game.service;

import org.springframework.stereotype.Component;

@Component
public class PlayerOneScore {

	private int playerOneScore;
	private static final int ZERO = 0;

	public void playerOneScored() {
		playerOneScore++;
	}

	public int getPlayerOneScored() {
		return playerOneScore;
	}

	public void setScoreForPlayerOne(String playerOneScore) {
		this.playerOneScore = ZERO;
		for (int i = ZERO; i < Integer.parseInt(playerOneScore); i++) {
			playerOneScored();
		}
	}

}