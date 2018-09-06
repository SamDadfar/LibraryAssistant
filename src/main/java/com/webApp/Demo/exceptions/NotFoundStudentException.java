package com.webApp.Demo.exceptions;

public class NotFoundStudentException extends RuntimeException{
	static final String message="Student Not Found ";
	public NotFoundStudentException(){
		super(message);
}
}