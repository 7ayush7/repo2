package com.ayush.coding.test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortAMapByValues {

	static Map sortMapByValues(Map map){
		Map<Integer, Integer> ret = new LinkedHashMap<>();
		List<Entry<Integer, Integer>> entry = new LinkedList<>(map.entrySet()); 
		Collections.sort(entry, (a,b)->{
			return a.getValue().compareTo(b.getValue());
		});
		for(Entry<Integer, Integer> e:entry){
			ret.put(e.getKey(), e.getValue());
		}
		
		return ret;
	}
	public static void main(String[] args){
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(1, 5);
		map.put(2, 4);
		map.put(3, 3);
		map.put(4, 2);
		map.put(5, 1);
		System.out.println(map);
		System.out.println(sortMapByValues(map));
	}
}
