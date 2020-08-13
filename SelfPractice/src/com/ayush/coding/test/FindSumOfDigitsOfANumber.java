package com.ayush.coding.test;

import java.util.Scanner;

public class FindSumOfDigitsOfANumber {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int sum=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
