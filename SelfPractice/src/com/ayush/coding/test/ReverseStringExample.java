package com.ayush.coding.test;

import java.util.Scanner;

public class ReverseStringExample {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		StringBuilder b = new StringBuilder();
		for(int i=0;i<s.length();i++){
			b.append(s.charAt(s.length()-1-i));
		}
		System.out.println(b.toString());
	}
}
