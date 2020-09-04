package com.learning.ayush.miscellaneous;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

	public static void main(String[] args) {
		Integer[] array = new Integer[] { -1, -99, 0, 8, 9, 99 };
		Arrays.sort(array);
		System.out.println(array[array.length - 2]);
	}
}
