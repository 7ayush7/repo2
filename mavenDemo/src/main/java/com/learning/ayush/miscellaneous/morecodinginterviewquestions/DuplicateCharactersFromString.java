package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharactersFromString {

	public static void main(String[] args) {
		String s = "Hello world my name is ayush kumar singh";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 2) {
				System.out.println(e);
			}
		}
	}
}
