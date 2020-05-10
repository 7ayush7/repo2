package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumberinAnArray {

	public static void main(String[] args){
		int[] arr = new int[]{5,4,1,2,8,9,7};
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==(arr[i]+1)){
					list.add(arr[i]);
					break;
				}
				else{
					list.add(arr[i]);
					list.add(arr[i]+1);
					break;
				}
			}
			if(i==arr.length-1){
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
}
