package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumber1To100 {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		for(int i=2;i<100;i++){
			boolean isPrime=true;
			for(int j=2;j<=i;j++){
				if(i%j==0 && j!=i){
					isPrime=false;
				}
			}
			if(isPrime){
				list.add(i);
			}
		}
		System.out.println(list);
	}
}
