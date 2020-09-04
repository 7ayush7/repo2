package com.learning.ayush.miscellaneous;

public class SortingAnArrayWithoutArraysSortMethod {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, -12, 0, 99, -99, 101 };
		System.out.println(arr);
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}
}
