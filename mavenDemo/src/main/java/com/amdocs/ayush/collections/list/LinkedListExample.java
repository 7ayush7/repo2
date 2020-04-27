package com.amdocs.ayush.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer[] i = new Integer[]{1,2};
		List<Integer> list2 = new ArrayList<Integer>();
		list2=Arrays.asList(i);
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
		System.out.println(list3.equals(list));
		System.out.println(list.containsAll(list3));
		list.push(1);
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		Iterator<Integer> iter = list.descendingIterator();
		//Iterates the list in reverse order
		Collections.reverse(list3);
		System.out.println(list3);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		list4.add(0);
		list4.add(1);
		list4.add(2);
		
		Iterator<Integer> descIter = list4.descendingIterator();
		while(descIter.hasNext()){
			System.out.print(descIter.next());
		}
		System.out.println();
		List<Integer> list5=(List<Integer>) list4.clone();
		for(Integer i2:list5){
			System.out.print(i2);
		}
	}
}
