package com.example.demo;

import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	public String name;
	
	public void display() {
		System.out.println("Inside Employee display method");
	}
}
