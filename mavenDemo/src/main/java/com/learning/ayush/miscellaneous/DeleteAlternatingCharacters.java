package com.learning.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteAlternatingCharacters {

	public static void main(String args[]) {
		System.out.println("Enter a string with alternating characters :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		List<String> list = new ArrayList<>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!list.contains(String.valueOf(c[i]))) {
				list.add(String.valueOf(c[i]));
			}
		}
		System.out.println(list);
		StringBuilder builder = new StringBuilder();
		for (String s1 : list) {
			builder.append(s1);
		}
		System.out.println(builder.toString());
	}
}
