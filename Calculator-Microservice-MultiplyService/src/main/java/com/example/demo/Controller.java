package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@PostMapping("/")
	public Object multiply(@RequestParam("i") Integer i,@RequestParam("j") Integer j) {
		if(!(i instanceof Integer)) {
			throw new CustomException("number is not an Integer");
		}
		return i*j;
	}
}
