package com.tennis.game.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerTwoScore {
	private int playerTwoScore;

	public void playerTwoScored() {
		playerTwoScore++;
	}

	public int getPlayerTwoScored() {
		return playerTwoScore;
	}

	public void setScoreForPlayerTwo(String playerTwoScore) {
		this.playerTwoScore = 0;
		for (int i = 0; i < Integer.parseInt(playerTwoScore); i++) {
			playerTwoScored();
		}
	}
}