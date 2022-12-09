package com.tennis.game.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerTwoScore {
	private int playerTwoScore;
	private static final int ZERO = 0;

	public void playerTwoScored() {
		playerTwoScore++;
	}

	public int getPlayerTwoScored() {
		return playerTwoScore;
	}

	public void setScoreForPlayerTwo(String playerTwoScore) {
		this.playerTwoScore = ZERO;
		for (int i = ZERO; i < Integer.parseInt(playerTwoScore); i++) {
			playerTwoScored();
		}
	}
}