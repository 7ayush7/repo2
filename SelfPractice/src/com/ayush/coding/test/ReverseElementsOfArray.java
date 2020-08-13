package com.ayush.coding.test;

import java.util.Arrays;

public class ReverseElementsOfArray {

	static int rev(int i){
		int sum=0;
		int rem=0;
		while(i>0){
			rem=i%10;
			sum=sum*10+rem;
			i=i/10;
		}
		return sum;
	}
	public static void main(String[] args){
		int[] arr = {112,334};
		int[] arr2 = new int[arr.length];

		for(int i=0;i<arr.length;i++){
			arr2[i]=rev(arr[i]);
		}
		System.out.println(arr2);
	}
}
