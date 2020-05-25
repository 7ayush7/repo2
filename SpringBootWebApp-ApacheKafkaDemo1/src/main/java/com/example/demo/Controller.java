package com.example.demo;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	KafkaTemplate<String, String> kafka;
	private static final String TOPIC = "Ayush";
	
	@GetMapping("/{message}")
	public Object get(@PathVariable("message") String message) {
		kafka.send(TOPIC , message);
		JSONObject object = new JSONObject();
		object.append("message", message);
		return object;
	}
}
