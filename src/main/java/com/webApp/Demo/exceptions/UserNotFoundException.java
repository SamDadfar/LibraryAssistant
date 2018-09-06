package com.webApp.Demo.exceptions;

public class UserNotFoundException extends RuntimeException{
	static final String message="User Not Found";
	public UserNotFoundException(String message) {
		super(message);
	}
	public UserNotFoundException() {
		this(message);
	}
	
}
