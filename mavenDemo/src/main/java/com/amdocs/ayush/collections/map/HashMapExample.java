package com.amdocs.ayush.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args){
		HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(0, 0);
		map1.put(1, 1);
		map1.put(2, 2);
		map1.put(3, 3);
		map1.put(4, 4);

		for(Entry<Integer, Integer> m:map1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		
		for(Integer i : map1.keySet()){
			System.out.println("Key : "+i);
		}
		System.out.println();
		
		for(Integer i : map1.values()){
			System.out.println("Value : "+i);
		}
		System.out.println();
		
		Map<Integer,Integer> map2=(Map<Integer, Integer>) map1.clone();
		
		System.out.println();
		
		map2.replace(4, 5);
		System.out.println(map2);
		
		System.out.println(map2.equals(map1));
	}
}
