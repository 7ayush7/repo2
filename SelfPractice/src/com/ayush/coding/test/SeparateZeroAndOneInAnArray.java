package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.List;

public class SeparateZeroAndOneInAnArray {

	public static void main(String[] args){
		int[] arr = {1,0,1,0,0,0,1,1,0};
		int zeroes = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				zeroes++;
			}
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<zeroes;i++){
			list.add(0);
		}
		for(int k=zeroes;k<arr.length;k++){
			list.add(1);
		}
		int[] fin = list.stream().mapToInt(a->a).toArray();
		System.out.println(fin);
	}
}
