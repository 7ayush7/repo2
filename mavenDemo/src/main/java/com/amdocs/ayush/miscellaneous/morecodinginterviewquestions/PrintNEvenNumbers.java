package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Scanner;

public class PrintNEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter number of even numbers to show :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for (int i=0;count<num;i=i+2) {
			System.out.println(i);
			count++;
		}
	}
}
