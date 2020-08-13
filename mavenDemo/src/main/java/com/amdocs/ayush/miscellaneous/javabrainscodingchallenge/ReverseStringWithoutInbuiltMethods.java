package com.amdocs.ayush.miscellaneous.javabrainscodingchallenge;

public class ReverseStringWithoutInbuiltMethods {

	public static void main(String[] args){
		String s = "Ayushman";
		char[] c = s.toCharArray();
		char[] rev = new char[s.length()];
		for(int i=c.length-1;i>=0;i--){
			rev[rev.length-1-i]=c[i];
		}
		System.out.println(String.valueOf(rev));
	}
}
