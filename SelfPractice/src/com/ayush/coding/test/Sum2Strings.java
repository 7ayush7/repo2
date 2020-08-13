package com.ayush.coding.test;

public class Sum2Strings {

	public static void main(String[] atgs){
		String s1 = "Hi";
		String s2 = "There";
		String s3 = s1+s2;
		System.out.println(s3);
		StringBuilder b = new StringBuilder(s1);
		b.append(s2);
		System.out.println(b.toString());
	}
}
