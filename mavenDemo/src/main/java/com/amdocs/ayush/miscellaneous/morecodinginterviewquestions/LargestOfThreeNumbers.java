package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Collections;
import java.util.TreeSet;

public class LargestOfThreeNumbers {

	public static void main(String[] args){
		int[] arr={92,29,876};
		int max = arr[0];
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		System.out.println(set.first());
	}
}
