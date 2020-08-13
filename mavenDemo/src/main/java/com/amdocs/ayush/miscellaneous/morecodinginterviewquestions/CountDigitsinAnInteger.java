package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class CountDigitsinAnInteger {

	public static void main(String[] args){
		int num=123456789;
		int size=0;
		while(num>0){
			size++;
			num=num/10;
		}
		System.out.println(size);
	}
}
