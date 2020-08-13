package com.ayush.coding.test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * s="123" - true
 * s="123s" - false
 * */
public class CheckIfStringIsNumber {

	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		System.out.println("Is String a number : "+Pattern.matches("[1-9]*", input));
	}
}
