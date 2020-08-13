package com.ayush.coding.test;

import java.util.Scanner;

public class ReverseStringWithoutInbuiltMethods {

	public static void main(String[] args){
		
		String s = new Scanner(System.in).nextLine();
		char rev[] = new char[s.length()];
		for(int i=0;i<s.length();i++){
			rev[rev.length-1-i]=s.charAt(i);
		}
		System.out.println(String.valueOf(rev));
	}
}
