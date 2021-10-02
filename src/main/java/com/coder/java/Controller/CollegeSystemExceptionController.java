package com.coder.java.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.coder.java.Exception.CollegeSystemException;


@ControllerAdvice
public class CollegeSystemExceptionController {

	@ExceptionHandler(value = CollegeSystemException.class)
	public ResponseEntity<Object> exception(CollegeSystemException exception)
	{
		return new ResponseEntity<>("No such student exists", HttpStatus.NOT_FOUND);
	}
	
}
