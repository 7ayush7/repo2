package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static char findFirstRepChar(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					return ch[i];
				}
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		System.out.println("Please enter the string with repetive characters");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		System.out.println(findFirstRepChar(ch));

	}
}
