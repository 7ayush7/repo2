package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class PrintFibonnaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the length of fibonacci series :");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int f = 0;
		int n = 1;
		int temp;
		System.out.println(f);
		System.out.println(n);
		for (int i = 0; i < range - 2; i++) {
			temp = f;
			f = n;
			n = temp + f;
			System.out.println(n);
		}
	}
}
