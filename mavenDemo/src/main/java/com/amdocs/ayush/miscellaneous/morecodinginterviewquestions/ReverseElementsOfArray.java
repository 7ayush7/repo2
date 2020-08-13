package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class ReverseElementsOfArray {

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int[] rev = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			rev[rev.length-1-i] = arr[i];
		}
		System.out.println(rev);
	}
	
}
