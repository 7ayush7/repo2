package com.learning.ayush.immutable;

public class ImmutableExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Basantpur");
		Employee e = new Employee(1, "Ayush", add);
		System.out.println("Address -> " + e.getAdd().streetName);
		e.getAdd().streetName = "Ballia";
		// add.streetName="Ballia";
		System.out.println("Address -> " + e.getAdd().streetName);
	}
}
