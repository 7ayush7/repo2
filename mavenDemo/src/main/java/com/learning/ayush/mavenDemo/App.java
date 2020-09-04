package com.learning.ayush.mavenDemo;

/**
 * Hello world!
 *
 */
enum P {
	A, B, C, D;
}

public class App {

	public static void main(String[] args) {
		System.out.println(P.A.equals(P.A));
		System.out.println(P.A == (P.A));
		System.out.println(P.A == (P.B));

	}
}
