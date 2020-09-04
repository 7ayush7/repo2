package com.learning.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}

public class SortListUsingComparator {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("A"));
		list.add(new Student("A"));
		list.add(new Student("AAA"));
		list.add(new Student("AA"));
		list.add(new Student("AAAAA"));
		list.add(new Student("AA"));

		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		System.out.println(list);
	}
}
