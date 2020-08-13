package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Scanner;

public class AnagramStrings {

	public static void checkAnagram(String s1, String s2){
		boolean flag=false;
		int count=0;
		if(s1.length()!=s2.length()){
			flag=false;
		}
		else{
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i)==s2.charAt(j)){
						count++;
						break;
					}
				}
			}
			if(count==s2.length()){
				flag=true;
			}
			System.out.println("Is Anagram : "+flag);
		}
	}
	public static void main(String[] args){
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		checkAnagram(s1,s2);
	}
}
