package com.example.demo;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	public String handleException(Exception e) {

		return e.getMessage();
	
	}
}
