package com.ayush.coding.test;

import java.util.Scanner;

public class ToCheckGivenNumberIsPerfectSquareOrNot {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		boolean flag=false;
		int sqrt = 0;
		for(int i=1;i<=num/2;i++){
			if(i*i==num){
				sqrt=i;
				flag=true;
				break;
			}
		}
		System.out.println("Is perfect square : "+flag +" "+sqrt);
	}
}
