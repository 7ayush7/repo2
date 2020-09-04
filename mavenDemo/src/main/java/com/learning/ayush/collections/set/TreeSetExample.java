package com.learning.ayush.collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(123);
		set.add(2);
		set.add(23);
		set.add(3);
		set.add(1);
		set.add(0);

		// Iterator
		Iterator<Integer> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next());
		}

		System.out.println();

		// Descending Iterator
		Iterator<Integer> itr2 = set.descendingIterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next());
		}

		// headSet, tailSet, subSet, addAll, toArray
		System.out.println();
		Set<Integer> set2 = set.headSet(3, true);
		System.out.print(set2);

		System.out.println();
		Set<Integer> set3 = set.tailSet(3, true);
		System.out.print(set3);

		System.out.println();
		Set<Integer> set4 = set.subSet(-1, true, 1111, true);
		System.out.print(set4);

		System.out.println();
		Integer[] arr = new Integer[set.size()];
		arr = set.toArray(arr);
		StringBuffer ret = new StringBuffer();
		ret.append("[");
		for (int i = 0; i < arr.length; i++) {

			ret.append(arr[i] + ",");
		}
		int index = ret.lastIndexOf(",");
		ret.replace(index, index + 1, "]");
		System.out.print(ret.toString());

		TreeSet<Integer> set5 = new TreeSet<Integer>(Collections.reverseOrder());
		System.out.println(set5.comparator());
	}
}
