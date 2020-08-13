package com.ayush.coding.test;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int rem=0;
		int sum=0;
		while(num>0){
			rem=num%10;
			sum = sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
