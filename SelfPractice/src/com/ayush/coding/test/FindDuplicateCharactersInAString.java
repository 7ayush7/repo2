package com.ayush.coding.test;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharactersInAString {

	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		char[] split = input.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		Set<Character> ret = new LinkedHashSet<>();
		for(int i=0;i<split.length;i++){
			if(!set.add(split[i])){
				ret.add(split[i]);
			}
		}
		System.out.println(set);
		System.out.println(ret);

	}
}
