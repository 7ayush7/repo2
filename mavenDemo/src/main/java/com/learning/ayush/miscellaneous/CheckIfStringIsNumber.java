package com.learning.ayush.miscellaneous;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckIfStringIsNumber {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean isNumber = true;
		System.out.println(input);
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!Pattern.matches("\\d", String.valueOf(c[i]))) {
				isNumber = false;
			}
		}
		System.out.println("String : " + input + " is Number : " + isNumber);
	}
}
