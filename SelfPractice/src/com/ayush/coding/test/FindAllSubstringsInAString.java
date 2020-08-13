package com.ayush.coding.test;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllSubstringsInAString {

	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] split = input.split(" ");
		System.out.println(Arrays.asList(split));
	}
}
