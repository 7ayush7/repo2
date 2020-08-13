package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.List;

public class SeparateZeroOneTwoInAnArray {

	public static void main(String[] args){
		int[] arr = {0,1,2,0,1,2,0,1,2};
		int zeroes = 0;
		int ones = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				zeroes++;
			}
			else if(arr[i]==1){
				ones++;
			}
		}
		List<Integer> fin = new ArrayList<>(arr.length);
		for(int k=0;k<zeroes;k++){
			fin.add(0);
		}
		for(int l=zeroes;l<zeroes+ones;l++){
			fin.add(1);
		}
		for(int m=zeroes+ones;m<arr.length;m++){
			fin.add(2);
		}
		System.out.println(fin);
	}
}
