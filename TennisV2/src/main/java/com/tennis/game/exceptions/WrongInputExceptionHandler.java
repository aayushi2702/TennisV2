package com.tennis.game.exceptions;

public class WrongInputExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public WrongInputExceptionHandler() {
	}

	public WrongInputExceptionHandler(String message) {
		super(message);
		this.message = message;
	}

}
