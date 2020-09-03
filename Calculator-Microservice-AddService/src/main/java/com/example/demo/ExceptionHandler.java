package com.example.demo;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	public Object handleException(Exception e) throws JSONException {
		JSONObject obj = new JSONObject();
		obj.append("Exception", e.getMessage());
		return obj;
	}
}
