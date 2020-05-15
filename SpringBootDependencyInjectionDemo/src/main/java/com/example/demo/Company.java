package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Company {

	public String name;
	public Employee e;
	
	public void display() {
		System.out.println("Inside Company display method");
	}
}
