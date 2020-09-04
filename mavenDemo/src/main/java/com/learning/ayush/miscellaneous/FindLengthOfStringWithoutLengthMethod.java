package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class FindLengthOfStringWithoutLengthMethod {
	public static void main(String[] args) {
		System.out.println("Please enter the string :");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		char[] ch = inputStr.toCharArray();
		System.out.println("Length of String is : " + ch.length);
	}

}
