package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.DocFlavor.INPUT_STREAM;

class SortAMapByValuesTest{
	int id1;
	int id2;
	
	public SortAMapByValuesTest(int id1, int id2) {
		this.id1=id1;
		this.id2=id2;
	}
}
public class SortAMapByValues {

	public static HashMap<Integer, Integer> sortMapByValues(HashMap<Integer, Integer> inputMap){
		List<Entry<Integer,Integer>> list = new ArrayList<>(inputMap.entrySet());
		Collections.sort(list, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
		LinkedHashMap<Integer, Integer> retMap = new LinkedHashMap<>();
		for(Entry<Integer, Integer> e:list){
			retMap.put(e.getKey(), e.getValue());
		}
		return retMap;
		
		
	}
	public static void main(String[] args){
		HashMap<Integer, Integer> inputMap = new HashMap<>();
		inputMap.put(5,1);
		inputMap.put(4,2);
		inputMap.put(3,3);
		inputMap.put(2,4);
		inputMap.put(1,5);
		System.out.println(inputMap);
		inputMap=sortMapByValues(inputMap);
		System.out.println(inputMap);
		
	}
}
