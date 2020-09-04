package com.learning.ayush.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		int[] staticArray1 = new int[2];
		int[] staticArray2 = new int[] { 1, 2 };
		// In both above examples the array that we have defined is static
		// because of which we are bound to add data upto a certain size limit.
		// here comes the requirement of ArrayList which is nothig but dynamic Array.

		List<String> list1 = new ArrayList<String>();
		// ArrayList is a dynamic array
		// It maintains insertion order
		// it stores elements just like as an array,
		// it is good for storing and retrieval of data
		// but if there is data manipulation then it becomes slow as various shifting
		// operations occur internally for
		// even one new element that gets added into the list. Hence for that there is
		// LinkedList
		// It is not synchronized
		list1.add("a");
		list1.add("b");
		list1.add(1, "c");
		System.out.println(list1);
		Iterator<String> iterate = list1.iterator();// list1.listIterator(); works just the same as this,
		// just that by using list iterator we get freedom to work in both directions
		// (hasPrevious() and hasNext() methods)
		while (iterate.hasNext()) {
			if (iterate.next().equals("a")) {
				iterate.remove();// works properly
			}
		}
		System.out.println(list1);
		list1.add(0, "a");
		list1.remove(2);
		System.out.println(list1);
		for (String i : list1) {
			if (i.equals("a")) {
				list1.remove(i);// throws error
			}
		}
		System.out.println(list1);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(0);
		list3.add(1);
		list3.add(2);
		list3.add(3);

		list3.remove(0);// This is tricky as in both remove() methods one takes param as int other as
						// object
		// So this way it will remove not element 0 but element as 0 index, So to delete
		// "0" we need to pass param as
		// .remove(Integer.valueOf(0));

		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		for (String i : list2) {
			if (i.equals("d")) {
				list2.remove(i);
			}
			System.out.println(i);
		}
		System.out.println(list2);// I encountered a weird behavior that if you delete 2nd last element from list
		// via for each then it does not throw any ConcurrentModificationException,
		// found a great stackoverflow thread on this
		// Please refer :
		// https://stackoverflow.com/questions/16079931/java-lists-remove-method-works-only-for-second-last-object-inside-for-each-loo
		List<Integer> list4 = new ArrayList<Integer>();
		System.out.println(list4.isEmpty());// list4 holds memory reference of newly created list, hence its not null
		List<Integer> list5 = null;
		System.out.println(list5.isEmpty());// Gives null pointer exception as there list5 reference holds null as
											// reference
	}
}
