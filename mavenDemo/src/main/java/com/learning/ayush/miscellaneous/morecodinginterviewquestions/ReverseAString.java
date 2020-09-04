package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String in = new Scanner(System.in).nextLine();
		// new StringBuilder(in).reverse().toString();
		StringBuilder b = new StringBuilder();
		for (int i = in.length() - 1; i >= 0; i--) {
			b.append(in.charAt(i));
		}
		System.out.println(b.toString());
	}
}
