package com.ayush.coding.test;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElementInAnArray {

	public static void main(String[] atgs){
		int max = Arrays.asList(1,2,3,4,5,6,7).stream().mapToInt(a->a).max().getAsInt();
		int d = Arrays.asList(1,2,3,4,5,6,7).stream().
				filter(a->a<max).sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(d);
		
		int[] arr = {1,2,3,4,5,6,77,7,8,9,99};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
	}
}
