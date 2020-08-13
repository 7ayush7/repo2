package com.ayush.coding.test;

import java.util.Scanner;

/**
 * s="nitin" - true
 * s="ayush" - false
 * s="aaa" - true
 * */
public class CheckPallindromeString {

	public static void main(String[] args){
		boolean isPallindrome = true;
		String s = new Scanner(System.in).nextLine();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				isPallindrome=false;
			}
		}
		System.out.println("Is Pallindrome : "+isPallindrome);
	}
}
