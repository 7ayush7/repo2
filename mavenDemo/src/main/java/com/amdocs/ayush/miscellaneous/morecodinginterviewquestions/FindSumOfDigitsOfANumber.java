package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class FindSumOfDigitsOfANumber {
	public static void main(String[] args){
		int num = 12345678;
		int sum=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
