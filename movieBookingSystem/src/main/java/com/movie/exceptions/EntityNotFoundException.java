package com.movie.exceptions;

public class EntityNotFoundException extends Exception {

	private String message;
	public EntityNotFoundException() {
		// TODO Auto-generated constructor stub
		
	}
	public EntityNotFoundException(String s)
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
