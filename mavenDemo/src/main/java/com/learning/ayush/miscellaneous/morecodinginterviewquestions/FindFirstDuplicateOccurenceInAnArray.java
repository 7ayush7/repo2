package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstDuplicateOccurenceInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8 };
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.println("First duplicate : " + arr[i]);
				break;
			}
		}
	}
}
