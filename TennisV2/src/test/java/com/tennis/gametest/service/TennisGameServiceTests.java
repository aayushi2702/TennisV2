package com.tennis.gametest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tennis.game.service.TennisGameService;

@RunWith(MockitoJUnitRunner.class)
class TennisGameServiceTests {

	private TennisGameService tennisGameService = new TennisGameService();

	@Test
	void testWhenBothPlayerIsAtZero() {
		assertThat(tennisGameService.getGameScore()).isEqualTo("Love All");
	}
}
