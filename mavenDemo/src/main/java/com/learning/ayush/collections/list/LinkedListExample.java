package com.learning.ayush.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer[] i = new Integer[] { 1, 2 };
		List<Integer> list2 = new ArrayList<Integer>();
		list2 = Arrays.asList(i);
		list.addAll(list2);
		list.addFirst(Integer.valueOf(0));
		list.addFirst(Integer.valueOf(-1));
		System.out.println(list);
		Integer[] toArray = new Integer[list.size()];
		toArray = list.toArray(toArray);
		System.out.println(toArray);
		LinkedList<Integer> list3 = (LinkedList<Integer>) list.clone();
		System.out.println(list3);
		System.out.println(list3.contains(1));
		System.out.println("Equals " + list3.equals(list));
		System.out.println(list.containsAll(list3));
		list.push(1);
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		Iterator<Integer> iter = list.descendingIterator();
		// Iterates the list in reverse order
		Collections.reverse(list3);
		System.out.println(list3);
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		LinkedList<Integer> list4 = new LinkedList<Integer>();
		list4.add(0);
		list4.add(1);
		list4.add(2);

		Iterator<Integer> descIter = list4.descendingIterator();
		while (descIter.hasNext()) {
			System.out.print(descIter.next());
		}
		System.out.println();
		LinkedList<Integer> list5 = (LinkedList<Integer>) list4.clone();
		for (Integer i2 : list5) {
			System.out.print(i2);
		}
		System.out.println();
		list5.sort(Collections.reverseOrder());
		ListIterator<Integer> revIterate = list5.listIterator();
		while (revIterate.hasNext()) {
			System.out.print(revIterate.next());
		}
		System.out.println();
		List<Integer> t = new ArrayList<Integer>();
		Integer[] i2 = { 1, 2, 3 };
		Set<Integer> set2 = new HashSet<>(t);
		Collections.addAll(set2, i2);
		// its one way or you can do :
		// Set<Integer> set = new HashSet<Integer>(Arrays.asList(i2));
		// that way it will create the set with list created from an array
		System.out.println(set2);
	}
}
