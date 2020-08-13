package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class PrintElementsAtEvenPosition {

	public static void main(String[] args){
		int[] arr = {0,1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i=i+2){
			System.out.println(arr[i]);
		}
	}
}
