package com.learning.ayush.miscellaneous;

public class SeparateZeroAndOneInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 1, 1, 0, 0, 0, 1 };
		int count = 0;
		// Arrays.sort(arr);//One way
		// Other Way
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count + 1; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(arr);

	}
}
