package com.learning.ayush.java8.stream;

import java.util.stream.Stream;

class Customer {
	public int id;
	String name;

	Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Program7 {

	public static void main(String[] args) {

		Stream.of(new Customer(1, "test1"), new Customer(2, "test2"), new Customer(3, "test3")).filter(q -> q.id > 1)
				.map(a -> a.id + " " + a.name.toUpperCase()).forEach(w -> System.out.println(w));

	}
}
