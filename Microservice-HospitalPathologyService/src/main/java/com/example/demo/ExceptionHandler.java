package com.example.demo;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import net.minidev.json.JSONObject;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	public Object handleException(PathalogyCustomRuntimeException e) {
		JSONObject obj = new JSONObject();
		obj.appendField("error", e.getMessage());
		return obj;
	}
}
