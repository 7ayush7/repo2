package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class FindPairWhoseSumIsClosestToXInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 99, 3, 1, 45, 2 };
		int x = 5;
		LinkedHashMap<List<Integer>, Integer> map = new LinkedHashMap<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				map.put(Arrays.asList(arr[i], arr[j]), sum);
			}
		}
		System.out.println(map);
		for (Entry<List<Integer>, Integer> e : map.entrySet()) {
			map.put(e.getKey(), (e.getValue() - x));
		}
		System.out.println(map);
		System.out.println(map.size());
		Set<List<Integer>> keySet = (map.keySet());
		Object[] a = new Object[keySet.size()];
		a = keySet.toArray(a);
		List<Integer> values = new LinkedList<>(map.values());
		Collections.sort(values);
//		System.out.println(keySet);
		System.out.println(values);
		int index = 0;
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) >= 0) {
				index = i;
				break;
			} else {
				index++;
			}
		}
		System.out.println(index);
		System.out.println(a[index]);

		/////////
		// **** INCOMPLETE CODE ****
		/////////

	}
}
