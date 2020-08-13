package com.ayush.coding.test;

import java.util.Scanner;

public class CyclicString {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		if(s1.length()==s2.length() && (s2+s2).contains(s1)){
			System.out.println("Cyclic String");
		}
		else{
			System.out.println("Not Cyclic");
		}
	}
}
