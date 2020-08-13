package com.amdocs.ayush.miscellaneous.javabrainscodingchallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPallindromeSubstring {

	public static void main(String[] args){
		String s = "Hi Everyone my name is not ntn also not nnnntttnnnn but its nitin";
		String[] split = s.split(" ");
		List<String> list = Arrays.asList(split).stream().sorted((a,b)->a.length()<b.length()?1:a.length()>b.length()?-1:0).collect(Collectors.toList());
		for(int i=0;i<list.size();i++){
			StringBuilder builder = new StringBuilder();
			String check = builder.append(list.get(i)).reverse().toString();
			if(list.get(i).equals(check)){
				System.out.println("Biggest pallindrome : "+String.valueOf(list.get(i)));
				break;
			}
		}
	}
}
