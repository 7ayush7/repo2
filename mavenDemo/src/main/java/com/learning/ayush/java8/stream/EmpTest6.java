package com.learning.ayush.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given the list of employee, group them by employee name
 */
public class EmpTest6 {

	public static void main(String[] args) {
		Stream.of(new Employee("test1", 99), new Employee("test2", 11), new Employee("test5", 25),
				new Employee("test4", 25), new Employee("test3", 55), new Employee("test6", 100))
				.collect(Collectors.groupingBy(Employee::getName)).forEach((a, b) -> System.out.println(a + " - " + b));
		;
	}
}
