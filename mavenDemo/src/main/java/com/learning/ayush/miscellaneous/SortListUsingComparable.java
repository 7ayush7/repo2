package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.id > this.id ? 1 : o.id < this.id ? -1 : 0;
	}

	public String toString() {
		return String.valueOf(this.id);
	}
}

public class SortListUsingComparable {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(999), new Employee(1), new Employee(344), new Employee(76),
				new Employee(2), new Employee(87));
		Collections.sort(list);
		System.out.println(list);

	}
}
