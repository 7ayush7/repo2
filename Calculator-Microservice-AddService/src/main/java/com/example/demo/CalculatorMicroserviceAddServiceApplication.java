package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CalculatorMicroserviceAddServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorMicroserviceAddServiceApplication.class, args);
	}

}
