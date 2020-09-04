package com.learning.ayush.miscellaneous;

class Parent {
	Parent() {
		System.out.println("Inside Parent Default");
	}
}

public class SuperConstructorExample extends Parent {
	int id;

	SuperConstructorExample(int id) {// Here 1st statement is super(); hence it will directly call
		// default parent constructor
		// this() and super() can't coexist in same constructor
		// as both need to be the first statement in the constructor
		// hence if nothing is mentioned then implicitly super() will be the 1st
		// statement in a constructor
		this.id = id;
		System.out.println("Inside Child Parameterised constructor");
	}

	SuperConstructorExample() {
		// not called.
		System.out.println("Inside Child Default Constructor");
	}

	public static void main(String[] args) {
		new SuperConstructorExample(1);
	}
}