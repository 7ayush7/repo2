package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReturnMaximumOccuringCharacterInString {

	public static void main(String[] args) {
		String s = "accbbbbada";
		char[] c = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
		int max = -1;
		char m = ' ';
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() >= max) {
				max = e.getValue();
			}
		}
		System.out.println(max);
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == max) {
				m = e.getKey();
				break;
			}
		}
		System.out.println(m);
	}
}
