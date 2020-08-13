package com.ayush.coding.test;

import java.util.Scanner;

public class CountNumberOfEvenAndOddDigitsInAnInteger {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int countOdd=0;
		int countEven=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			if(rem%2==0){
				countEven++;
			}else{
				countOdd++;
			}
			num=num/10;
		}
		System.out.println("Odd : "+countOdd);
		System.out.println("Even : "+countEven);
	}
}
