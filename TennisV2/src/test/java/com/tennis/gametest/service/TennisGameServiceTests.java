package com.tennis.gametest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tennis.game.service.PlayerOneScore;
import com.tennis.game.service.PlayerTwoScore;
import com.tennis.game.service.TennisGameService;

@RunWith(MockitoJUnitRunner.class)
class TennisGameServiceTests {

	private TennisGameService tennisGameService = new TennisGameService();

	@Test
	void testWhenBothPlayerIsAtZero() {
		assertThat(tennisGameService.getGameScore(0, 0)).isEqualTo("Love All");
	}

	@Test
	void testWhenBothPlayerIsAtOne() {
		TennisGameService tennisGameService = new TennisGameService();
		PlayerOneScore playerOneScore = new PlayerOneScore();
		PlayerTwoScore playerTwoScore = new PlayerTwoScore();
		playerOneScore.playerOneScored();
		playerTwoScore.playerTwoScored();
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Fifteen All");
	}
}
