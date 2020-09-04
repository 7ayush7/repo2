package com.learning.ayush.collections.map;

import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<Integer, Integer> table1 = new Hashtable<Integer, Integer>();
		table1.put(2, 2);
		table1.put(1, 1);
		table1.put(3, 2);
		table1.put(1, 1);
		table1.put(4, 4);

		// Hshtable is synchronized
		// Hashtable is from legacy
		// Hashtable contains non null key and value
		// Contains uniques key and value
		// hashtable is slow compared to hashmap
		System.out.println(table1);
//		for(Entry<Integer, Integer> i : table1.entrySet()){
//			if(i.getKey().equals(1)){
//				table1.remove(i.getKey());
//			}
//		}
	}
}
