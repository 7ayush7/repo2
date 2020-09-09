package com.ayush.coding.test;

public class MaxAndMinOfAnArray {

	public static void main(String[] args){
		int[] arr={1,2,3,55,6,7,8,9,0,-1};
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
