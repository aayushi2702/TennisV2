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

	@BeforeEach
	public void setUp() {
		tennisGameService = new TennisGameService();
		playerOneScore = new PlayerOneScore();
		playerTwoScore = new PlayerTwoScore();
	}

	@Test
	void testWhenBothPlayerIsAtZero() {
		assertThat(tennisGameService.getGameScore(0, 0)).isEqualTo("Love All");
	}

	@Test
	void testWhenBothPlayerIsAtOne() {
		playerOneScore.playerOneScored();
		playerTwoScore.playerTwoScored();
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Fifteen All");
	}
}
