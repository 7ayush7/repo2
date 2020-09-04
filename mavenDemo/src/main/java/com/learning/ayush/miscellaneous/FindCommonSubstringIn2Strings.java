package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class FindCommonSubstringIn2Strings {
	public static void main(String[] args) {
		System.out.println("Enter string 1 :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter string 2 :");
		sc = new Scanner(System.in);
		String s2 = sc.nextLine();

		String commonSubstring = new String();

		String[] arr1 = s1.split("\\s");
		String[] arr2 = s2.split("\\s");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (String.valueOf(arr1[i]).equals(arr2[j])) {
					commonSubstring = arr2[j];
				}
			}
		}

		System.out.println(commonSubstring);
	}
}
