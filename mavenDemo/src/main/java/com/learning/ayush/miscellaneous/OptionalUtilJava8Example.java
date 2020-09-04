package com.learning.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Emp {
	String name;
	int id;

	Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return this.id + " " + this.name;
	}
}

public class OptionalUtilJava8Example {

	public static List<Emp> createWithDefaultValues() {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("emp1", 1));
		list.add(new Emp("emp2", 2));
		list.add(new Emp("emp3", 3));
		list.add(new Emp("emp4", 4));
		list.add(new Emp("emp5", 5));
		list.add(new Emp("emp5", 6));

		return list;

	}

	public static Optional<Emp> findEmployeeByName(List<Emp> list, String name) {
		for (Emp e : list) {
			if (e.name.equals(name)) {
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		List<Emp> empList = createWithDefaultValues();
		Optional<Emp> e = findEmployeeByName(empList, "emp1");
		// e.name Throws null pointer exception as we didnt handled the return null from
		// called method
		if (e.isPresent()) {
			System.out.println(e.get());
		} else {
			System.out.println("No value present");
		}
	}
}
