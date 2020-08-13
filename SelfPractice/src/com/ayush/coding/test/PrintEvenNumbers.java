package com.ayush.coding.test;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		for(int i=2;i<=num;i=i+2){
			System.out.println(i);
		}
	}
}
