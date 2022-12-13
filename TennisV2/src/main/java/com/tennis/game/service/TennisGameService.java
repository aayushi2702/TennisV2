package com.tennis.game.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class TennisGameService {

	private static final String DEUCE = "Deuce";
	private static final String ADVANTAGE = "Advantage";
	private static final String PLAYERONE = "PlayerOneName";
	private static final String PLAYERTWO = "PlayerTwoName";
	private static final String GAME = "Game";
	private static final String SCORE_LOVE = "Love";
	private static final String SCORE_FIFTEEN = "Fifteen";
	private static final String SCORE_THIRTY = "Thirty";
	private static final String SCORE_FORTY = "Forty";
	private static final String STRING_ALL = "All";
	private static final Map<Integer, String> SCORE_MAP = new HashMap<>();
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;

	static {
		SCORE_MAP.put(ZERO, SCORE_LOVE);
		SCORE_MAP.put(ONE, SCORE_FIFTEEN);
		SCORE_MAP.put(TWO, SCORE_THIRTY);
		SCORE_MAP.put(THREE, SCORE_FORTY);
	}

	public String getGameScore(Integer playerOneScore, Integer playerTwoScore) {
		if (Objects.equals(playerOneScore, playerTwoScore)) {
			return playerOneScore > TWO ? DEUCE : getPlayerScore(playerOneScore).concat(" ").concat(STRING_ALL);
		} else {
			if (Math.max(playerTwoScore, playerOneScore) > THREE) {
				return (pointDifferenceIsOne(playerOneScore, playerTwoScore) ? ADVANTAGE : GAME).concat(" ")
						.concat(getHighScorerPlayerName(playerOneScore, playerTwoScore));
			} else {
				return getPlayerScore(playerOneScore).concat(" ").concat(getPlayerScore(playerTwoScore));
			}
		}
	}

	private boolean pointDifferenceIsOne(int playerOneScore, int playerTwoScore) {
		return Math.abs(playerOneScore - playerTwoScore) == ONE;
	}

	private String getHighScorerPlayerName(int playerOneScore, int playerTwoScore) {
		return playerOneScore > playerTwoScore ? PLAYERONE : PLAYERTWO;
	}

	private String getPlayerScore(int playerScore) {
		return SCORE_MAP.get(playerScore);
	}

}
