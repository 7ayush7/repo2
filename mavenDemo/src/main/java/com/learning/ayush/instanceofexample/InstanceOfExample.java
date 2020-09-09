package com.learning.ayush.instanceofexample;

class Parent {

	void test() {
		System.out.println("Parent");
	}
}

class Child extends Parent {

	void childMethod() {
		System.out.println("Child Method");
	}
	void test() {
		System.out.println("Child");
	}
}

public class InstanceOfExample {

	static void dummyMethod(Parent p) {
		if (p instanceof Parent) {
			Child c = (Child) p;
			c.childMethod();
		}
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		dummyMethod(parent);
		parent.test();

	}
}
