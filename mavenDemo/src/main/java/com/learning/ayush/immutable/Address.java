package com.learning.ayush.immutable;

public class Address implements Cloneable {

	String streetName;

	Address() {
	}

	Address(String streetName) {
		this.streetName = streetName;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
