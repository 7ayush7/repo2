package com.learning.ayush.collections.designpattern.creationaldesignpattern;

import java.util.ArrayList;
import java.util.List;

class School implements Cloneable {
	private List<Student> list = new ArrayList<>();

	School() {
		this.list.add(new Student("test1"));
		this.list.add(new Student("test2"));
		this.list.add(new Student("Ayushman"));
	}

	public School Clone() throws CloneNotSupportedException {
		School s = (School) super.clone();
		s.list = new ArrayList<>(this.list);
		return s;

	}

	public List<Student> getData() {
		return new ArrayList<>(this.list);
	}

	public String toString() {
		StringBuilder build = new StringBuilder("");
		for (Student s : this.list) {
			build.append(s.toString() + " ");
		}
		return build.toString();
	}
}

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
	}

	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return this.name;
	}
}

public class PrototypeDesignPatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		School s = new School();

		School s2 = s.Clone();
		System.out.println(s2);
		System.out.println(s);

		List<Student> testList = s2.getData();
		testList.add(new Student("test3"));
		System.out.println(testList);
		System.out.println(s2);
	}
}
