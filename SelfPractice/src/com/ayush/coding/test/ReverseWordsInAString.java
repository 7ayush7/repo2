package com.ayush.coding.test;

import java.util.Scanner;

public class ReverseWordsInAString {

	static String reverse(String s){
		StringBuilder b = new StringBuilder();
		for(int i=0;i<s.length();i++){
			b.append(s.charAt(s.length()-1-i));
		}
		return b.toString();
	}
	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		String[] split = s.split(" ");
		StringBuilder b = new StringBuilder();
		for(int i=0;i<split.length;i++){
			b.append(reverse(split[i]));
			b.append(" ");
		}
		b.replace(b.lastIndexOf(" "), b.lastIndexOf(" ")+1, "");
		System.out.println(b.toString());
	}
}
