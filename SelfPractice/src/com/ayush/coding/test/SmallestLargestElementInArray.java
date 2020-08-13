package com.ayush.coding.test;

public class SmallestLargestElementInArray {

	public static void main(String[] args){
		int[] arr = {-100,1,2,3,4,72,22,0,2222,-32};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
