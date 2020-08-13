package com.ayush.coding.test;

import java.util.Scanner;

/**
 * number = 121 - true
 * number = 111 - true
 * number = 122 - false
 * */
public class CheckPallindromeNumber {

	public static void main(String[] args){
		int input = new Scanner(System.in).nextInt();
		int backup = input;
		int rem = 0;
		int sum=0;
		while(input>0){
			rem=input%10;
			sum=sum*10+rem;
			input=input/10;
		}
		System.out.println(backup==sum?"Pallindrome":"Not Pallindrome");
	}
}
