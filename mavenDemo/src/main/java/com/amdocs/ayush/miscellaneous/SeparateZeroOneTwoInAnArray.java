package com.amdocs.ayush.miscellaneous;

public class SeparateZeroOneTwoInAnArray {

	public static void main(String[] args){
		int[] arr = new int[]{1,0,2,2,0,2,1,0,0,1,2,0};
		int countZero=0;
		int countOne=0;

		int[] retArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				countZero++;
			}
			else if(arr[i]==1){
				countOne++;
			}
		}
		for(int i=0;i<countZero;i++){
			retArr[i]=0;
		}
		for(int i=countZero;i<arr.length-countOne-1;i++){
			retArr[i]=1;
		}
		for(int i=(countOne+countZero);i<arr.length;i++){
			retArr[i]=2;
		}
		System.out.println(retArr);
	}
}
