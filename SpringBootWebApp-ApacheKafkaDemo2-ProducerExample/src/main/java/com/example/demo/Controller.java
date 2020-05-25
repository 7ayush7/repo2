package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Controller {

	@Autowired
	KafkaTemplate<String, User> kafka;
	
	private static final String TOPIC = "Kafka_Test";
	
	@GetMapping("/{name}")
	public String get(@PathVariable("name") String name) {
		
		kafka.send(TOPIC , new User(1, name));
		return "Message Published Successfully";
	}
	
}
