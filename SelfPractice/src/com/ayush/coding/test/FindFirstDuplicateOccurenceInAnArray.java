package com.ayush.coding.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstDuplicateOccurenceInAnArray {

	public static void main(String[] args){
		int arr[] = {1,2,3,44,44,5,6};
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++){
			if(!set.add(arr[i])){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
