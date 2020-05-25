package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	ConcurrentKafkaListenerContainerFactory<String, User> listener;
	
	@KafkaListener(groupId = "group-id-1", topics = "Kafka_Test", containerFactory = "getUserListener")
	public void listen(User user) {
		System.out.println(user);
	}
}
