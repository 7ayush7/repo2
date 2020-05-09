package com.amdocs.ayush.miscellaneous;

public class StringHashCodeTest {

	public static void main(String[] args) {
		String s = "Ayush";
		String s2 = "Ayush";
		
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
