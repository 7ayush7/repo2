package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringBootWebAppApacheKafkaDemo2ConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppApacheKafkaDemo2ConsumerExampleApplication.class, args);
	}

}
