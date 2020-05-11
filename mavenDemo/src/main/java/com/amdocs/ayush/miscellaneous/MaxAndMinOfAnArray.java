package com.amdocs.ayush.miscellaneous;

public class MaxAndMinOfAnArray {

	public static void main(String[] args){
	int[] arr = new int[]{1,2,2,-9999,999,77,6,5,4,3,22,-9999};	
	System.out.println(arr);
	int max = arr[0];
	int min = arr[0];
	
	//one way
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				min = arr[i];
				arr[i]=arr[j];
				arr[j]=min;
			}			
		}
	}
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				max = arr[i];
				arr[i]=arr[j];
				arr[j]=max;
			}			
		}
	}
	System.out.println(min);
	System.out.println(max);
	
	int temp=arr[0];
	//other way
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Max : "+arr[0]);
	System.out.println("Max : "+arr[arr.length-1]);

	}
}
