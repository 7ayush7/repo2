package com.amdocs.ayush.miscellaneous.javabrainscodingchallenge;

public class ReverseInteger {

	public static void main(String[] args){
		int data = 1234567;
		int rev=0;
		int mod=0;
		System.out.println(data);
		while(data>0){
			mod=data%10;
			rev=rev*10+mod;
			data=data/10;
		}
		System.out.println(rev);
	}
}
