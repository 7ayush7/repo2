package com.learning.ayush.miscellaneous;

public class ReverseStringExample {

	public static void main(String[] args) {
		String s = "Hello! world this is random text";
		StringBuilder str = new StringBuilder(s);
		System.out.println(str.reverse());// One way

		char[] c = s.toCharArray();
		StringBuilder newStr = new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {
			newStr.append(c[i]);
		}
		System.out.println(newStr.toString());// The Other way
	}
}
