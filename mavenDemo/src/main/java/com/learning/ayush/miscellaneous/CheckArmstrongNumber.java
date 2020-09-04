package com.learning.ayush.miscellaneous;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to check whether its armstrong or not : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int backupNum = num;
		int retNum = 0;
		int temp = 0;
		System.out.println(num);
		while (num > 0) {
			temp = num % 10;
			retNum = (temp * temp * temp) + retNum;
			num = num / 10;
		}
		System.out.println(retNum);
		if (backupNum == retNum) {
			System.out.println("Armstrong Number");
		}
	}
}
