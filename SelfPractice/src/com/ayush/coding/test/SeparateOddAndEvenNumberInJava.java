package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.List;

public class SeparateOddAndEvenNumberInJava {

	public static void main(String[] args){
		int[] arr = {1,13,12,23,2,44,5,65,6,7,7,9,88};
		int evenCount=0;
		int oddCount=0;
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenList.add(arr[i]);
			}
			else{
				oddList.add(arr[i]);
			}
		}
		evenList.addAll(oddList);
		int[] finalArr = evenList.stream().mapToInt(a->a).toArray();
		
	}
}
