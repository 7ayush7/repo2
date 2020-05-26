package com.amdocs.ayush.java8.stream;

import java.util.stream.Stream;

/**
 * 
 * Task :
 * 
 * Filter the list with duplicate names
 * 
 * */
public class EmpTest8 {

	public static void main(String[] args){
		Stream.of(new Employee("Mary", 99),new Employee("test2", 11),
				new Employee("test5", 25),new Employee("test4", 25),
				new Employee("test3", 55),new Employee("Mary", 100))
		//.map(q->q.getName())
		.distinct()
		.forEach(q->System.out.println(q));
	}
}
