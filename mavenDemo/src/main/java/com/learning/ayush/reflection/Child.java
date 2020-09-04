package com.learning.ayush.reflection;

public class Child extends Parent {

	private String data;
	public String name;

	Child() {
	}

	Child(String data, String name) {
		this.data = data;
		this.name = name;
	}

	private String getData() {
		return "This was a private method, data = " + data;
	}

	private void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
