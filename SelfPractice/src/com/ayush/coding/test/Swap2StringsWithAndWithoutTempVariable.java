package com.ayush.coding.test;

public class Swap2StringsWithAndWithoutTempVariable {

	public static void main(String[] args){
		String a1 = "ayush";
		String a2 = "kr";
		
		a1 = a1+a2;
		a2 = a1.substring(0,a1.length()-a2.length());
		a1 = a1.substring(a2.length());
		System.out.println(a2);
		System.out.println(a1);
	}
}
