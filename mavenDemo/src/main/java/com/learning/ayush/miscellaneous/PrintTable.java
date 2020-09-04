package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		System.out.println("Enter value :");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(value + " * " + i + " = " + (value * i));
		}
	}
}
