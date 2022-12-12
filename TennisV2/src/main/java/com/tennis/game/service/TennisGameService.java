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
	private static final String SCORE_LOVE_FIFTEEN = "Love Fifteen";
	private static final String SCORE_LOVE = "Love";
	private static final String SCORE_FIFTEEN = "Fifteen";
	private static final String SCORE_THIRTY = "Thirty";
	private static final String SCORE_FORTY = "Forty";

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
			if (Math.max(playerTwoScore, playerOneScore) > 3) {
				if (pointDifferenceIsOne(playerOneScore, playerTwoScore)) {
					return ADVANTAGE.concat(" ").concat(getHighScorerPlayerName(playerOneScore, playerTwoScore));
				} else {
					return GAME.concat(" ").concat(getHighScorerPlayerName(playerOneScore, playerTwoScore));
				}
			}else {
				return getPlayerScore(playerOneScore) +" "+ getPlayerScore(playerTwoScore);
			}
		}
	}

	private boolean pointDifferenceIsOne(int playerOneScore, int playerTwoScore) {
		return Math.abs(playerOneScore - playerTwoScore) == 1;
	}

	private String getHighScorerPlayerName(int playerOneScore, int playerTwoScore) {
		return playerOneScore > playerTwoScore ? PLAYERONE : PLAYERTWO;
	}
	
	private String getPlayerScore(int playerScore) {
		if(playerScore==0)
			return SCORE_LOVE;
		else if(playerScore==1)
			return SCORE_FIFTEEN;
		else if(playerScore==2)
			return SCORE_THIRTY;
		else
			return SCORE_FORTY;
	}

}
