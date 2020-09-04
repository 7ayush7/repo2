package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class CheckPallindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = 0;
		int retNum = 0;
		int backupNumber = number;
		System.out.println(number);
		while (number > 0) {
			temp = number % 10;
			retNum = retNum * 10 + temp;
			number = number / 10;
		}
		System.out.println(retNum);
		if (backupNumber == retNum) {
			System.out.println("Pallindrome Number");
		}
	}
}
