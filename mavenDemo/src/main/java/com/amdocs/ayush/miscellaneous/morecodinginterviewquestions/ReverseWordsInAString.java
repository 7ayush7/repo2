package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

public class ReverseWordsInAString {

	public static void main(String[] args){
		String s = "Hello My name is Ayush Kumar Singh";
		String[] split = s.split(" ");
		StringBuilder builder = new StringBuilder();
		for(int i=split.length-1;i>=0;i--){
			builder.append(split[i]);
			builder.append(" ");
		}
		System.out.println(builder.toString().trim());
	}
}
