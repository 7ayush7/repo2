package com.ayush.coding.test;

import java.util.Scanner;

public class RemoveAllWhiteSpacesFromAString {

	public static void main(String[] atgs){
		String s = new Scanner(System.in).nextLine();
		s=s.replace(" ", "");
		System.out.println(s);
	}
}
