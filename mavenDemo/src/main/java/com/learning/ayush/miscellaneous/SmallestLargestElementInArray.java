package com.learning.ayush.miscellaneous;

import java.util.Arrays;

public class SmallestLargestElementInArray {

	public static void main(String[] arg) {
		Integer[] array = new Integer[] { 1, 2, 23, 45, 3, 0 };
		Arrays.sort(array);
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
	}
}
