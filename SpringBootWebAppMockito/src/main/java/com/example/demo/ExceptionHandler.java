package com.example.demo;

import org.json.JSONObject;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	public Object handleException(CustomException e) {
		JSONObject obj = new JSONObject();
		obj.append("error", e.getMessage());
		return obj;
	}
}
