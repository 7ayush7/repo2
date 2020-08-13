package com.ayush.coding.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args){
		String s1 = new Scanner(System.in).nextLine();
		System.out.println(Pattern.matches("[0-9]*", s1));
	}
}
