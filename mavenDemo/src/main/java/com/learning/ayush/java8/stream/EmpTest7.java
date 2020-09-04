package com.learning.ayush.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given the list of employees, find the employee with name “Mary”
 * 
 */
public class EmpTest7 {

	public static void main(String[] args) {
		Stream.of(new Employee("Mary", 99), new Employee("test2", 11), new Employee("test5", 25),
				new Employee("test4", 25), new Employee("test3", 55), new Employee("Mary", 100))
				.filter(a -> a.getName().equals("Mary")).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
	}
}
