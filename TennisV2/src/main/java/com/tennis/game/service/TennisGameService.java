package com.tennis.game.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class TennisGameService {

	private static final String SCORE_LOVE_ALL = "Love All";
	private static final String SCORE_FIFTEEN_ALL = "Fifteen All";
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final String SCORE_THIRTY_ALL = "Thirty All";
	private static final String DEUCE = "Deuce";
	private static final String ADVANTAGE = "Advantage";
	private static final String PLAYERONE = "PlayerOneName";
	private static final String PLAYERTWO = "PlayerTwoName";
	private static final String GAME = "Game";

	public String getGameScore(Integer playerOneScore, Integer playerTwoScore) {
		if (Objects.equals(playerOneScore, playerTwoScore)) {
			if (playerOneScore == ZERO) {
				return SCORE_LOVE_ALL;
			} else if (playerOneScore == ONE) {
				return SCORE_FIFTEEN_ALL;
			} else if (playerOneScore == TWO) {
				return SCORE_THIRTY_ALL;
			} else {
				return DEUCE;
			}
		} else {
			if (pointDifferenceIsOne(playerOneScore, playerTwoScore)) {
				return ADVANTAGE + " " + (playerOneScore > playerTwoScore ? PLAYERONE : PLAYERTWO);
			} else {
				return GAME + " " + (playerOneScore > playerTwoScore ? PLAYERONE : PLAYERTWO);
			}
		}
	}

	private boolean pointDifferenceIsOne(int playerOneScore, int playerTwoScore) {
		return Math.abs(playerOneScore - playerTwoScore) == 1;
	}

}
