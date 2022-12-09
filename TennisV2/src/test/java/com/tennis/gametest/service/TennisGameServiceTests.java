package com.tennis.gametest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tennis.game.service.PlayerOneScore;
import com.tennis.game.service.PlayerTwoScore;
import com.tennis.game.service.TennisGameService;

@RunWith(MockitoJUnitRunner.class)
class TennisGameServiceTests {

	private TennisGameService tennisGameService;
	private PlayerOneScore playerOneScore;
	private PlayerTwoScore playerTwoScore;
	private static final String SCORE_LOVE_ALL = "Love All";
	private static final String SCORE_FIFTEEN_ALL = "Fifteen All";
	private static final Integer ZERO = 0;

	@BeforeEach
	public void setUp() {
		tennisGameService = new TennisGameService();
		playerOneScore = new PlayerOneScore();
		playerTwoScore = new PlayerTwoScore();
	}

	@Test
	void testWhenBothPlayerIsAtZero() {
		assertThat(tennisGameService.getGameScore(ZERO, ZERO)).isEqualTo(SCORE_LOVE_ALL);
	}

	@Test
	void testWhenBothPlayerIsAtOne() {
		playerOneScore.playerOneScored();
		playerTwoScore.playerTwoScored();
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo(SCORE_FIFTEEN_ALL);
	}
}
