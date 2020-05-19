package com.example.demo;

public class AdminCustomRuntimeException extends RuntimeException{

	private String message;
	public AdminCustomRuntimeException(String message) {
		super(message);
	}
}
