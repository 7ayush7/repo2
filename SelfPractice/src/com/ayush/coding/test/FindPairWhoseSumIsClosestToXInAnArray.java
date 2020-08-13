package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * @ayush singh
 * **/
public class FindPairWhoseSumIsClosestToXInAnArray {

	public static void main(String[] args){
		int[] arr = {1,0,2,3,4,5,6,7,8,9,10};
		int sum = 21;
		Map<Object,Object> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				map.put(Arrays.asList(arr[i],arr[j]), arr[i]+arr[j]);
			}
		}
		List<Object> list = new ArrayList<>();
		System.out.println(map);
		for(Entry<Object, Object> e:map.entrySet()){
			if(Integer.valueOf((Integer) e.getValue())<=sum){
				list.add(e.getKey());
			}
		}
		System.out.println(list.get(list.size()-1));
		
	}
}
