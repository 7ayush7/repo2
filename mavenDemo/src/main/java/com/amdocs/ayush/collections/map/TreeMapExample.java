package com.amdocs.ayush.collections.map;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args){
		TreeMap<Integer, Integer> map1 = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		map1.put(0,0);
		map1.put(1,1);
		map1.put(2,2);
		map1.put(6,6);
		map1.put(3,3);
		map1.put(4,4);
		map1.put(5,5);
		
		System.out.println(map1);
		Map<Integer,Integer> map2 = map1.headMap(4,true);
		System.out.println(map2);
		Map<Integer,Integer> map3 = map1.headMap(4,true);
		System.out.println(map3);
		Map<Integer,Integer> map4 = map1.subMap(6,true,4,true);
		System.out.println(map4);
		Set<Integer> set1 = map1.descendingKeySet();
		System.out.println(set1);
		Map<Integer,Integer> map5 = map1.descendingMap();
		System.out.println(map5);
		
	}
	
}
