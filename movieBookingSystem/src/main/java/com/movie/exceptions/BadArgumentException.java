package com.movie.exceptions;

public class BadArgumentException extends Exception {

	private String message;
	public BadArgumentException() {
		// TODO Auto-generated constructor stub
		
	}
	public BadArgumentException(String s)
	{
		message=s;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
