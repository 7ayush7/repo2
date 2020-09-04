package com.learning.ayush.java8;

import java.io.PrintStream;

interface Utility {
	void say();
}

interface Parent {
	Test write();
}

class Test {
	String message;

	Test() {
		this.message = "Ayush";
		System.out.println(this.message);
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// 1. Referring a static method
		Utility u1 = () -> printData();// This can also be written as :
		Utility u2 = MethodReferenceExample::printData;
		u1.say();
		u2.say();

		// 2. Referring a non-static method
		Utility u3 = () -> new MethodReferenceExample().printData2();// This can also be written as :
		Utility u4 = new MethodReferenceExample()::printData2;
		u3.say();
		u4.say();

		// 3. Referring a constructor
		Parent p = () -> new Test();// This can also be written as :
		Parent p1 = Test::new;
		p.write();
		p1.write();
	}

	public static void printData() {
		System.out.println("Static print data");
	}

	public void printData2() {
		System.out.println("Non-Static print data");
	}

}
