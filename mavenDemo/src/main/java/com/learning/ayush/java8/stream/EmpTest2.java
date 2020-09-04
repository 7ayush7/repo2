package com.learning.ayush.java8.stream;

import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given the list of employees, count number of employees with age 25
 * 
 */
public class EmpTest2 {

	public static void main(String[] args) {
		System.out.println(Stream
				.of(new Employee("test1", 99), new Employee("test2", 11), new Employee("test5", 25),
						new Employee("test4", 25), new Employee("test3", 55), new Employee("test6", 100))
				.filter(q -> q.getAge() == 25).count());
	}
}
