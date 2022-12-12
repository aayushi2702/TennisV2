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
	private static final String ZERO = "0";
	private static final String SCORE_THIRTY_ALL = "Thirty All";
	private static final String DEUCE = "Deuce";
	private static final String ONE = "1";
	private static final String TWO = "2";
	private static final String THREE = "3";
	private static final String FOUR = "4";
	private static final String SIX = "6";
	
	@BeforeEach
	public void setUp() {
		tennisGameService = new TennisGameService();
		playerOneScore = new PlayerOneScore();
		playerTwoScore = new PlayerTwoScore();
	}

	@Test
	void testWhenBothPlayerIsAtZero() {
		playerOneScore.setScoreForPlayerOne(ZERO);
		playerTwoScore.setScoreForPlayerTwo(ZERO);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo(SCORE_LOVE_ALL);
	}

	@Test
	void testWhenBothPlayerIsAtOne() {
		playerOneScore.setScoreForPlayerOne(ONE);
		playerTwoScore.setScoreForPlayerTwo(ONE);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo(SCORE_FIFTEEN_ALL);
	}
	
	@Test
	void testWhenBothPlayerIsAtTwo() {
		playerOneScore.setScoreForPlayerOne(TWO);
		playerTwoScore.setScoreForPlayerTwo(TWO);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo(SCORE_THIRTY_ALL);
	}
	
	@Test
	void testWhenBothPlayerIsAtThree() {
		playerOneScore.setScoreForPlayerOne(THREE);
		playerTwoScore.setScoreForPlayerTwo(THREE);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo(DEUCE);
	}
	
	@Test
	void testWhenBothPlayerIsAtThree1() {
		playerOneScore.setScoreForPlayerOne(FOUR);
		playerTwoScore.setScoreForPlayerTwo(THREE);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Advantage PlayerOneName");
	}
	
	@Test
	void testWhenOnePlayerIsAtThreeAndOtherIsAtFour() {
		playerOneScore.setScoreForPlayerOne(THREE);
		playerTwoScore.setScoreForPlayerTwo(FOUR);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Advantage PlayerTwoName");
	}
	
	@Test
	void testWhenPlayerTwoWon() {
		playerOneScore.setScoreForPlayerOne(FOUR);
		playerTwoScore.setScoreForPlayerTwo(SIX);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Game PlayerTwoName");
	}
	
	@Test
	void testWhenOnePlayerIsAtZeroAndOtherIsAtOne() {
		playerOneScore.setScoreForPlayerOne(ZERO);
		playerTwoScore.setScoreForPlayerTwo(ONE);
		assertThat(tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(),
				playerTwoScore.getPlayerTwoScored())).isEqualTo("Love Fifteen");
	}
}
