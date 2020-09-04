package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class FindTripletsFromAnArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 22, 444, 55, 6, 888);
		Collections.sort(list);
		System.out.println(list);
		LinkedHashMap<List<Integer>, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					map.put(Arrays.asList(list.get(i), list.get(j), list.get(k)), 1);
					break;
				}
				break;
			}
		}
		System.out.println(map.keySet());
	}
}
