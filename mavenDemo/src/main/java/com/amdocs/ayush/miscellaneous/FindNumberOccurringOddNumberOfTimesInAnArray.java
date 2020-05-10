package com.amdocs.ayush.miscellaneous;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindNumberOccurringOddNumberOfTimesInAnArray {

	public static void main(String args[]){
		int[] arr = new int[]{1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,6,6,6};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		for(Entry<Integer, Integer> e:map.entrySet()){
			if(e.getValue()%2!=0){
				System.out.println(e);
			}
		}
	}
}
