package com.example.demo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class Controller {
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);

	@GetMapping("test")
	public String testMethod() {
		for(int i=0;i<100;i++) {
			logger.error("This is test log "+i+" server.port = 8081");
		}
		return "This is test";
	}
}
