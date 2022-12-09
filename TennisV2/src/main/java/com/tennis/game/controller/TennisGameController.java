package com.tennis.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tennis.game.service.TennisGameService;

@RestController
public class TennisGameController {
	@Autowired
	private TennisGameService tennisGameService;

	@GetMapping(path = "/getGameScore")
	public String gameHandlerAPI(@RequestParam String playerOneScore, @RequestParam String playerTwoScore) {
		return tennisGameService.getGameScore();
	}
}