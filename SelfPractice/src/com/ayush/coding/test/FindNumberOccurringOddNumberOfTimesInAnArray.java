package com.ayush.coding.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNumberOccurringOddNumberOfTimesInAnArray {

	public static void main(String[] args){
	
		int[] arr = {1,1,2,2,3,3,3,4};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> e:map.entrySet()){
			if(e.getValue()%2!=0){
				System.out.println(e.getKey() +" occurred "+e.getValue()+" times");
			}
		}
	}
}
