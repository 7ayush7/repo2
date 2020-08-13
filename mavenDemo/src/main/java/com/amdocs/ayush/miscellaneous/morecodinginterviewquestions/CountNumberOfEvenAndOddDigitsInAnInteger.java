package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class CountNumberOfEvenAndOddDigitsInAnInteger {

	public static void main(String[] args){
		int num=123456789;
		int oddCount=0;
		int evenCount=0;
		while(num>0){
			if(num%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
			num=num/10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
