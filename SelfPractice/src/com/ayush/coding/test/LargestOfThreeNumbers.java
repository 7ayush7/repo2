package com.ayush.coding.test;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args){
		int num1 = new Scanner(System.in).nextInt();
		int num2 = new Scanner(System.in).nextInt();
		int num3 = new Scanner(System.in).nextInt();
		int min;
		if(num1<num2 && num1<num3){
			min=num1;
		}
		else if(num2<num3 && num2<num1){
			min=num2;
		}
		else{
			min=num3;
		}	
		System.out.println(min);
	}
}
