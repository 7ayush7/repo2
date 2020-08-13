package com.ayush.coding.test;

import java.util.Scanner;

public class FindFirstDigitLastDigitAndSumOfGivenNumber {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int lastDigit = num%10;
		int firstDigit=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			if(num>0){
				firstDigit=num;
			}
		}
		System.out.println(sum);
		System.out.println(firstDigit);
		System.out.println(lastDigit);
	}
}
