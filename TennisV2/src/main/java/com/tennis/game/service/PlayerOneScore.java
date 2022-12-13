package com.tennis.game.service;

import org.springframework.stereotype.Component;

import com.tennis.game.exceptions.WrongInputExceptionHandler;

@Component
public class PlayerOneScore {

	private int playerOneScore;
	private static final int ZERO = 0;
	private static final String EXCEPTION_MESSAGE = "Please enter Number for Player One";

	public void playerOneScored() {
		playerOneScore++;
	}

	public int getPlayerOneScored() {
		return playerOneScore;
	}

	public void setScoreForPlayerOne(String playerOneScore) {
		this.playerOneScore = ZERO;
		boolean isNumeric = true;
		try {
			Integer.parseInt(playerOneScore);
		} catch (Exception ex) {
			isNumeric = false;
		}
		if (isNumeric) {
			for (int i = ZERO; i < Integer.parseInt(playerOneScore); i++) {
				playerOneScored();
			}
		} else {
			throw new WrongInputExceptionHandler(EXCEPTION_MESSAGE);
		}

	}

}