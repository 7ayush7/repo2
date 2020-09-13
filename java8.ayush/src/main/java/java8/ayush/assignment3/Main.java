package java8.ayush.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ayush.singh
 * 
 * JDK 8 : Assignment 3 – Using Collectors & Peek
 * 
 Create an array 10,000 Employee Object with 3 attributes as Id, Name and Salary
 For each employee increment the salary by 20% 
 Sort the object based on incremented salary in descending order and return the map with key as Id & value as Employee object
 * */

public class Main {
	
	static long salary = 10;

	public static void main(String[] args) {
	List<Employee> list = new ArrayList<Employee>();
	for(int i=1;i<=100;i++) {
		list.add(new Employee(i, "A"+i, salary));
		salary = (int) (salary+((.2)*salary));
	}	
	System.out.println(list);
	
	list = sortList(list);
	System.out.println(createMap(list));
	}

	private static Map<Integer, Employee> createMap(List<Employee> list) {
		Map<Integer, Employee> map = new LinkedHashMap<Integer, Employee>();
		for(Employee e:list) {
			map.put(e.getId(), e);
		}
		return map;
	}

	private static List<Employee> sortList(List<Employee> list) {
		return list.stream().sorted((a1,a2)->a2.salary>a1.salary?1:a2.salary<a1.salary?-1:0).collect(Collectors.toList());
	}
}
