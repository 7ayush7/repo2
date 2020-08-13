package com.ayush.coding.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * aabcdd
 * dadacb
 * is anagram
 * */
public class AnagramStringExample {

	static void method1(String s1, String s2,int count){
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					count++;
					break;
				}
			}
		}
		if(count==s1.length()&&count==s2.length()){
			System.out.println("Anagram String");
		}
		else{
			System.out.println("Not Anagram");
		}
	}
	
	static void method2(String s1, String s2){
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(String.valueOf(c1).equals(String.valueOf(c2))){
			System.out.println("Anagram String");
		}else{
			System.out.println("Not Anagram");
		}
	}
	public static void main(String[] arfs){
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		int count=0;
		method1(s1,s2,count);
		method2(s1,s2);
	}
}
