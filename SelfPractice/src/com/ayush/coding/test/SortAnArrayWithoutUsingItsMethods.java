package com.ayush.coding.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortAnArrayWithoutUsingItsMethods {

	public static void main(String[] args){
		int[] arr = {1,1,2,-33,-3,9,99,101,22};
		int temp = arr[0];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		IntStream.of(arr).forEach(a->System.out.println(a));
	}
}
