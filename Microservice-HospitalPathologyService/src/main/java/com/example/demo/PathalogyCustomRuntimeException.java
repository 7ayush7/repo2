package com.example.demo;

public class PathalogyCustomRuntimeException extends RuntimeException{

	private String message;
	
	public PathalogyCustomRuntimeException(String message) {
		super(message);
	}
}
