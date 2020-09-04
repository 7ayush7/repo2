package com.learning.ayush.java8.stream;

import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given a list of employee, find maximum age of employee
 * 
 */
public class EmpTest3 {

	public static void main(String[] args) {
		System.out.println(Stream
				.of(new Employee("test1", 99), new Employee("test2", 11), new Employee("test5", 25),
						new Employee("test4", 25), new Employee("test3", 55), new Employee("test6", 100))
				.mapToInt(q -> q.getAge()).max().getAsInt());
	}
}
