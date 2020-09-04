package com.learning.ayush.miscellaneous;

import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateCharactersInAString {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (Character c2 : map.keySet()) {
			if (map.get(c2) >= 2) {
				map2.put(c2, map.get(c2));
			}
		}
		System.out.println(map2);
	}
}
