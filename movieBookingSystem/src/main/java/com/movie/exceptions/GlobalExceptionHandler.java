package com.movie.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({EntityNotFoundException.class})
	public ResponseEntity<String> handleEntityNotFound(EntityNotFoundException e)
	{
		System.out.println("Exception Handled");
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({BadArgumentException.class})
	public ResponseEntity<String> handleBadException(BadArgumentException e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	
//	
//	@ExceptionHandler(NullPointerException.class)
//	public ResponseEntity<String> handle
	
}
