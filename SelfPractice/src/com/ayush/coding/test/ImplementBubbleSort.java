package com.ayush.coding.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class ImplementBubbleSort {

	public static void main(String[] args){
		int a[] = {-100,100,1,2,3,5,9,7,6};
		boolean flag = false;
		int count=0;
		int temp = a[0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
					count++;
				}
			}
			if(flag==false){
				break;
			}
		}
		Stream.of(a).forEach(System.out::println);
		System.out.println(count);
	}
}
