package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class CheckPallindromeString {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		if (s.equals(s1.toString())) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
