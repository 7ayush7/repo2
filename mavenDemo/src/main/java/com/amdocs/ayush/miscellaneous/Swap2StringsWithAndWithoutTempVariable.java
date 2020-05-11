package com.amdocs.ayush.miscellaneous;

import java.util.Scanner;

public class Swap2StringsWithAndWithoutTempVariable {

	public static void main(String[] args){
		System.out.println("Enter string 1 :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter string 2 :");
		String s2 = sc.nextLine();

		//Using temp variable
//		String temp = new String();
//		temp = s1;
//		s1 = s2;
//		s2 = temp;
//		
//		System.out.println("String 1 : "+s1);
//		System.out.println("String 2 : "+s2);
		
		//Without using temp variable
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());//or s2 = s1.substring(0, s1.indexOf(s2))
		s1 = s1.substring(s2.length());
		System.out.println(s2);
		System.out.println(s1);
	}
}
