package com.learning.ayush.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 1, 1);
		System.out.println(list);
		// 1st way
		List<Integer> s = list.stream().distinct().collect(Collectors.toList());
		System.out.println(s);

		// 2nd way
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);

		// 3rd way
		List<Integer> dup = new ArrayList<>();// to list out duplicates
		List<Integer> dup2 = new ArrayList<>();// to store duplicates

		for (Integer i : list) {
			if (!dup.contains(i)) {
				dup.add(i);
			} else {
				if (!dup2.contains(i)) {
					dup2.add(i);
				}
			}
		}
		System.out.println(dup);
		System.out.println(dup2);
	}
}
