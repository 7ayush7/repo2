package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumberinAnArray {

	public static void main(String[] args){
		Integer[] a = {-1,0,2,3,4,6};
		Arrays.sort(a);
		int min=a[0];
		int max=a[a.length-1];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<a.length-1;i++){
				if(a[i]+1==a[i+1]){
					list.add(a[i]);
				}
				else{
					list.add(a[i]);
					list.add(a[i]+1);
				}
		}
		list.add(max);
		System.out.println(list);
	}
}
