package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		String in = new Scanner(System.in).nextLine();
		System.out.println("Contains only digits " + Pattern.matches("\\d+", in));
	}
}
