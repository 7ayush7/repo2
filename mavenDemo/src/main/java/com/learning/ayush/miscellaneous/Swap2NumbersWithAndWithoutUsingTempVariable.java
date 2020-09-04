package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class Swap2NumbersWithAndWithoutUsingTempVariable {

	public static void main(String[] args) {
		System.out.println("Enter number 1 :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = sc.nextInt();
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("number 1 : " + num1);
		System.out.println("number 2 : " + num2);
		// Above is using temp variable

		// Below is without temp variable
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("number 1 : " + num1);
		System.out.println("number 2 : " + num2);

	}
}
