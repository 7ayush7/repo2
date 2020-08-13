package com.ayush.coding.test;

import java.util.Scanner;

public class PrintElementsAtEvenPosition {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		for(int i=0;i<s.length();i=i+2){
			System.out.println(s.charAt(i));
		}
	}
}
