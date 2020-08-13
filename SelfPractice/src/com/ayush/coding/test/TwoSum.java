package com.ayush.coding.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {

	public static void main(String[] args){
		int[] arr={1,2,3,45,6};
		int sum=51;
		int search=0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		/*
		 * 1 way
		 * 
		 * for(int i=0;i<arr.length;i++){
			search=sum-arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==search){
					System.out.println(j);
					System.out.println(i);
				}
			}
		}*/
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(sum-arr[i])){
				System.out.println(sum-arr[i]);
				System.out.println(arr[i]);
			}
			else{
				map.put(arr[i], i);
			}
		}
	}
}
