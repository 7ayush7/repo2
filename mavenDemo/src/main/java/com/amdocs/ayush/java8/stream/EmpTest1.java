package com.amdocs.ayush.java8.stream;

import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given a list of employees, you need to filter all the employee whose age is greater than 
 * 20 and print the employee names.(Java 8 APIs only)
 * */

public class EmpTest1 {

	public static void main(String[] args){
		Stream.of(new Employee("test1", 99),new Employee("test2", 11),
				new Employee("test5", 33),new Employee("test4", 22),
				new Employee("test3", 55),new Employee("test6", 100))
		.filter(a->a.getAge()>20).forEach(a->System.out.println(a.getName()));
	}
}
