package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(5, 4, 3, 3, 2, 1));
		// one way
		list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));

		// other way
		int temp = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					list.set(i, list.get(j));
					list.set(j, temp);
					temp = list.get(j);
				}
			}
		}
		System.out.println(list);
	}
}
