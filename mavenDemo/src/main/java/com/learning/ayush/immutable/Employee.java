package com.learning.ayush.immutable;

public final class Employee {

	private final int id;
	private final String name;
	private final Address add;

	public Employee(int id, String name, Address add) throws CloneNotSupportedException {
		this.id = id;
		this.name = name;
		this.add = (Address) add.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() throws CloneNotSupportedException {
		return (Address) this.add.clone();
	}

}
