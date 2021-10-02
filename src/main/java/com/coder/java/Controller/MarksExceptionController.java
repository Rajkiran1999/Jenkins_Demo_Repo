package com.coder.java.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.coder.java.Exception.MarksException;

@ControllerAdvice
public class MarksExceptionController {
	@ExceptionHandler(value = MarksException.class)
	public ResponseEntity<Object> exception(MarksException exception)
	{
		return new ResponseEntity<>("Student denied Admission.", HttpStatus.NOT_FOUND);
	}
}
