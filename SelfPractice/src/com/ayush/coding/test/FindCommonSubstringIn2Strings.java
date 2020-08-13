package com.ayush.coding.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindCommonSubstringIn2Strings {

	public static void main(String[] args){
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();

		List<String> list = Arrays.asList(s1.split(" "));
		Set<String> list2 = new LinkedHashSet<>();

		String[] split2 = s2.split(" ");
		for(int i=0;i<split2.length;i++){
			if(list.contains(split2[i])){
				list2.add(split2[i]);
			}
		}
		System.out.println(list2);
	}
}
