package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsFromAnArray {

	public static void main(String[] args){
		int[] arr = {0,1,2,3,4,5,6,7};
		List<Object> list2 = new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					/*List<Object> list = new ArrayList<>();
					list.add(arr[i]);list.add(arr[j]);list.add(arr[k]);*/
					list2.add(Arrays.asList(arr[i],arr[j],arr[k]));
				}
			}
		}
		System.out.println(list2);
	}
}
