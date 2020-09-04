package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedListInPairs {

	public static void main(String[] args) throws Exception {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		if (list.size() % 2 != 0) {
			throw new Exception("Invalid List, Pair doesnt exist");
		} else {
			int temp = list.get(0);
			for (int i = 0; i < list.size() - 1; i++) {
				if (i % 2 == 0) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
				}
			}
		}
		System.out.println(list);
	}
}
