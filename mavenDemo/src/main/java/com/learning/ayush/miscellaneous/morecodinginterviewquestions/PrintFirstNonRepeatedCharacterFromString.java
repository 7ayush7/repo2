package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PrintFirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		char ret = ' ';
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				ret = e.getKey();
				break;
			}
		}
		System.out.println(ret);
	}
}
