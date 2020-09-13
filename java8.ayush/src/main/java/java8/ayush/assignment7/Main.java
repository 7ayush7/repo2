package java8.ayush.assignment7;

import java.util.ArrayList;
import java.util.List;

import java8.ayush.assignment3.Employee;

/**
 * @author ayush.singh
 * 
 *JDK 8 : Assignment 7 – Use method reference
1.      Create an array of Employee Object with 3 attributes as Id, Name and Salary
2.      Sort the object based on salary in descending order
 * */


@FunctionalInterface
interface Utility{
	public void doSomething();
}
public class Main {
	static List<Employee> list = new ArrayList<Employee>();

	static long salary = 10;
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			list.add(new Employee(i, "A"+i, salary));
			salary = salary+10;
		}
		Utility u1 = Main::sort;
		u1.doSomething();
	}
	
	private static void sort() {
		list.stream().sorted((o1,o2)->{
			return o1.getSalary()>o2.getSalary()?-1:o1.getSalary()<o2.getSalary()?-1:0;}).forEach(System.out::println);
	}
}
