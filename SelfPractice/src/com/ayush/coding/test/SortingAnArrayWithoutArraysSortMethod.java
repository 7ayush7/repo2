package com.ayush.coding.test;

public class SortingAnArrayWithoutArraysSortMethod {

	public static void main(String[] atgs){
		int arr[] = {-100,100,1,2,3,5,9,7,6};
		int a[] = {1,2,3,4,7,6,9,-2};
		int count=0;
		int temp = arr[0];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
		}
		System.out.println(arr);
		System.out.println(count);
	}
}
