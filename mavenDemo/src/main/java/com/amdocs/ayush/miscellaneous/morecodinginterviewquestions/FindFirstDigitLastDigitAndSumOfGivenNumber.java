package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class FindFirstDigitLastDigitAndSumOfGivenNumber {

	public static void main(String[] args){
		int num = 12345678;
		int last=num%10;
		int first=0;
		int sum=0, rem=0;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			if(num>0){
				first=num;
			}
		}
		System.out.println("first : "+first);
		System.out.println("last : "+last);
		System.out.println("sum : "+sum);
	}
}
