package com.learning.ayush.miscellaneous;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringExample {

	public static void main(String[] args) {
		System.out.println("Please enter string 1 :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		System.out.println("Please enter string 2 :");
		sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		if (s1.length() != s2.length()) {
			System.out.println("Not anagram strings");
		}
		// One way
		// Below Commented Code is working code
//		int counter=0;
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		for(int i=0;i<c1.length;i++){
//			for(int j=0;j<c2.length;j++){
//				if(c1[i]==c2[j]){
//					counter++;					
//				}
//			}
//		}
//		if(counter==s1.length()){
//			System.out.println("Anagram");			
//		}

		// Other Way
		// Using Arrays.sort

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (String.valueOf(c1).equals(String.valueOf(c2))) {
			System.out.println("Anagram");
		} else {
			System.out.println("No Anagram");
		}
	}
}
