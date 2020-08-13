package com.ayush.coding.test;

import java.util.Scanner;

/**
 * like 0,1,153,370
 * as 
 * 1 cube + 5 cube + 3 cube = 153
 * */
public class CheckArmstrongNumber {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int backup = num;
		int ar=0;
		int sum=0;
		while(num>0){
			ar=num%10;
			sum=sum+(ar*ar*ar);
			num=num/10;
		}
		if(backup==sum){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong");
		}
	}
}
