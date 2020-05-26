package com.amdocs.ayush.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task :
 * 
 * Join the all employee names with ","
 * */
public class EmpTest5 {

	public static void main(String[] args){
	List<String> list =	Arrays.asList(new Employee("test1", 99),new Employee("test2", 11),
				new Employee("test5", 25),new Employee("test4", 25),
				new Employee("test3", 55),new Employee("test6", 100)).stream()
		.map(q->q.getName()).collect(Collectors.toList());
	String appendedString = String.join(",", list);
	System.out.println(appendedString);
	}
}
