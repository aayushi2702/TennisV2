package com.tennis.gametest.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tennis.game.service.TennisGameService;

@RunWith(SpringRunner.class)
@WebMvcTest
class TennisGameControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TennisGameService tennisGameService;

	@Test
	void gameAPITest() throws Exception {

		when(tennisGameService.getGameScore()).thenReturn("");
		mockMvc.perform(get("/getGameScore?playerOneScore=0 & playerTwoScore=0")).andExpect(status().isOk());
	}
}