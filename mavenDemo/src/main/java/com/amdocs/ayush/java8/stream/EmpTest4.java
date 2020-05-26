package com.amdocs.ayush.java8.stream;

import java.util.stream.Stream;

/**
 * Task :
 * 
 * Given a list of employees, sort all the employee on the basis of age
 * 
 * */
public class EmpTest4 {

	public static void main(String[] args){
		Stream.of(new Employee("test1", 99),new Employee("test2", 11),
				new Employee("test5", 25),new Employee("test4", 25),
				new Employee("test3", 55),new Employee("test6", 100))
		.sorted((a,b)->{return a.getAge()>b.getAge()?1:a.getAge()<b.getAge()?-1:0;})
		.forEach(a->System.out.println(a));
	}
}
