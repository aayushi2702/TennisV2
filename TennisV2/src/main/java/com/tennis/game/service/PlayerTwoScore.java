package com.tennis.game.service;

import org.springframework.stereotype.Service;

import com.tennis.game.exceptions.WrongInputExceptionHandler;

@Service
public class PlayerTwoScore {
	private int playerTwoScore;
	private static final int ZERO = 0;
	private static final String EXCEPTION_MESSAGE = "Please enter Number for Player Two";

	public void playerTwoScored() {
		playerTwoScore++;
	}

	public int getPlayerTwoScored() {
		return playerTwoScore;
	}

	public void setScoreForPlayerTwo(String playerTwoScore) {
		this.playerTwoScore = ZERO;
		boolean isNumeric = true;
		try {
			Integer.parseInt(playerTwoScore);
		} catch (Exception ex) {
			isNumeric = false;
		}
		if (isNumeric) {
			for (int i = ZERO; i < Integer.parseInt(playerTwoScore); i++) {
				playerTwoScored();
			}
		} else {
			throw new WrongInputExceptionHandler(EXCEPTION_MESSAGE);
		}
	}
}