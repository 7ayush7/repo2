package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

public class ToCheckGivenNumberIsPerfectSquareOrNot {

	public static void main(String[] args) {
		int num = 81;
		System.out.println("Num : " + num);
		boolean isPallindrome = false;
		for (int i = 1; i <= num / 2; i++) {
			if (i * i == num) {
				System.out.println("Square root of : " + i);
				isPallindrome = true;
			}
		}
		System.out.println("Is Palindrome : " + isPallindrome);
	}
}
