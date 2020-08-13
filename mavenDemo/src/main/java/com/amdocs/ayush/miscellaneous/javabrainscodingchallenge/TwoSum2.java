package com.amdocs.ayush.miscellaneous.javabrainscodingchallenge;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

	public static void main(String[] args){
		int[] arr = {1,3,4,2,7};
		int sumTarget = 8;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(sumTarget-arr[i])){
				System.out.println("First Element : "+arr[i]+" index :"+i);
				System.out.println("Second Element : "+(sumTarget-arr[i])+" index :"+map.get(sumTarget-arr[i]));
			}
			else{
				map.put(arr[i], i);
			}
		}
	}
}
