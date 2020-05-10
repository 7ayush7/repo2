package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class SeparateOddAndEvenNumberInJava {

	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,11};
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenList.add(arr[i]);
			}
			else{
				oddList.add(arr[i]);
			}
		}
		int[] arr1 = new int[arr.length];
		for(int i=0;i<evenList.size();i++){
			arr1[i]=evenList.get(i);
		}
		for(int i=evenList.size();i<arr.length;i++){
			arr1[i]=oddList.get(i-evenList.size());
		}
		System.out.println(arr1);
	}
}
