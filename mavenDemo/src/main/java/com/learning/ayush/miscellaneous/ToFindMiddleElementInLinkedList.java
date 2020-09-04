package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.LinkedList;

public class ToFindMiddleElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(list);
		if (list.size() % 2 == 1) {
			System.out.println("Middle Element :");
			System.out.println(list.get(list.size() / 2));
		} else {
			System.out.println("Middle Elemets :");
			System.out.println(list.get(list.size() / 2));
			System.out.println(list.get(list.size() / 2) - 1);
		}
	}
}
