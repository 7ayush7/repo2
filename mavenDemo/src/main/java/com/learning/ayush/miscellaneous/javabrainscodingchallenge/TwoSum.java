package com.learning.ayush.miscellaneous.javabrainscodingchallenge;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 56, 32, 1, 2, 4 };
		int target = 60;
		int firstElement = arr[0];
		int secondElement = arr[0];
		int search;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (!flag) {
				firstElement = arr[i];
				search = target - arr[i];
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == search) {
						secondElement = arr[j];
						flag = true;
						break;
					}
				}
			}
		}
		if (flag) {
			System.out.println("elements found : " + firstElement + " " + secondElement);
		} else {
			System.out.println("No matching elements found");
		}

	}
}
