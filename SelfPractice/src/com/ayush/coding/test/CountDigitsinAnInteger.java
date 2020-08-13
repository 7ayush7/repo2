package com.ayush.coding.test;

import java.util.Scanner;

public class CountDigitsinAnInteger {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int count=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
