package com.tennis.game.service;

import org.springframework.stereotype.Service;

@Service
public class TennisGameService {

	private static final String SCORE_LOVE_ALL = "Love All";

	public String getGameScore() {
		return SCORE_LOVE_ALL;
	}

}
