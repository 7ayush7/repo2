package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class Controller {

	@GetMapping("/method1")
	public String method1() {
		return "Hi this is method1 of service1";
	}
}
