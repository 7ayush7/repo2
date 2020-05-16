package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	DBFactory factory;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@RequestMapping("/save")
	public String saveData(Customer c) {
		factory.save(c);
		return "save.jsp";
	}
}
