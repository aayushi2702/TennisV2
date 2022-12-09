package com.tennis.game.service;

import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class TennisGameService {

	private static final String SCORE_LOVE_ALL = "Love All";
	private static final String SCORE_FIFTEEN_ALL = "Fifteen All";

	public String getGameScore(Integer playerOneScore, Integer playerTwoScore) {
		if (Objects.equals(playerOneScore, playerTwoScore)) {
			if (playerOneScore == 0) {
				return SCORE_LOVE_ALL;
			} else if (playerOneScore == 1) {
				return SCORE_FIFTEEN_ALL;
			}
		}
		return SCORE_LOVE_ALL;
	}

}
