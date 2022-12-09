package com.tennis.game.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class TennisGameService {

	private static final String SCORE_LOVE_ALL = "Love All";
	private static final String SCORE_FIFTEEN_ALL = "Fifteen All";
	private static final int ZERO = 0;
	private static final int ONE = 1;

	public String getGameScore(Integer playerOneScore, Integer playerTwoScore) {
		if (Objects.equals(playerOneScore, playerTwoScore)) {
			if (playerOneScore == ZERO) {
				return SCORE_LOVE_ALL;
			} else if (playerOneScore == ONE) {
				return SCORE_FIFTEEN_ALL;
			}
		}
		return SCORE_LOVE_ALL;
	}

}
