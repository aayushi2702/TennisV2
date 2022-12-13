package com.tennis.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tennis.game.exceptions.WrongInputExceptionHandler;
import com.tennis.game.service.PlayerOneScore;
import com.tennis.game.service.PlayerTwoScore;
import com.tennis.game.service.TennisGameService;

@RestController
public class TennisGameController {
	@Autowired
	private TennisGameService tennisGameService;
	@Autowired
	private PlayerOneScore playerOneScore;
	@Autowired
	private PlayerTwoScore playerTwoScore;

	@GetMapping(path = "/getGameScore")
	public String gameHandlerAPI(@RequestParam String playerOneScored, @RequestParam String playerTwoScored)
			throws WrongInputExceptionHandler {
		playerOneScore.setScoreForPlayerOne(playerOneScored);
		playerTwoScore.setScoreForPlayerTwo(playerTwoScored);
		return tennisGameService.getGameScore(playerOneScore.getPlayerOneScored(), playerTwoScore.getPlayerTwoScored());
	}
}