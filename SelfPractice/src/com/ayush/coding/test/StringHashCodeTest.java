package com.ayush.coding.test;

public class StringHashCodeTest {

	public static void main(String[] args){
		String s = new String("AyushSingh");
		String s1 = "AyushSingh";
		String s2 = new String("AyushSingh").intern();
		String s3 = new StringBuilder("Ayush").append("Singh").toString();
		System.out.println(s==s1);//false
		System.out.println(s==s2);//false
		System.out.println(s==s3);//false
		
		System.out.println(s1==s);//false
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		System.out.println(s2==s);//false
		System.out.println(s2==s1);//true
		System.out.println(s2==s3);//false
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
