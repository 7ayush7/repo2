package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	public String name;
	@Autowired
	public Employee e;
	
	public void display() {
		System.out.println("Inside Company display method");
		e.display();
	}
}
