package com.learning.ayush.collections.hashcodeeqalscontract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ayush");
		Employee e2 = new Employee(1, "Ayushman");
		Employee e3 = new Employee(3, "Ayush");
		Employee e4 = new Employee(4, "Ayush");
		Employee e5 = new Employee(5, "Ayush");
		Employee e6 = new Employee(6, "Ayush");

		System.out.println(e1.equals(e2));

		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);

		// Good Article :
		// https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/
		System.out.println(set);

		Map<Employee, Integer> map = new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 2);

		for (Entry<Employee, Integer> e : map.entrySet()) {
			System.out.println(e.getKey().id + " " + e.getValue());
		}
	}
}
