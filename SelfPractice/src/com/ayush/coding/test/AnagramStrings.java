package com.ayush.coding.test;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args){
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		int count=0;
		if(s1.length()!=s2.length()){
			System.out.println("Not Anangram");
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(String.valueOf(c1).equals(String.valueOf(c2)));
	}
}
