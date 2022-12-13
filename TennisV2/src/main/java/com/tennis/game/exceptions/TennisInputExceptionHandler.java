package com.tennis.game.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TennisInputExceptionHandler {
	@ExceptionHandler(value = WrongInputExceptionHandler.class)
	public ResponseEntity<String> wrongInputExceptionHandler(WrongInputExceptionHandler wrongInputExceptionHandler) {
		return new ResponseEntity<>(wrongInputExceptionHandler.getMessage(), HttpStatus.CONFLICT);
	}
}