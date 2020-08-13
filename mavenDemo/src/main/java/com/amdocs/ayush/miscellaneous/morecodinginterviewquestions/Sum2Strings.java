package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class Sum2Strings {

	public static void main(String[] args){
		String s1 = "Hello ";
		String s2 = "World";
		StringBuilder s = new StringBuilder();
		for(int i=0;i<s1.length();i++){
			s.append(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			s.append(s2.charAt(i));
		}
		System.out.println(s.toString());
	}
}
