package com.ayush.coding.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersFromString {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		Set<Character> set1 = new LinkedHashSet<>();
		Set<Character> set2 = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			if(!set1.add(s.charAt(i))){
				set2.add(s.charAt(i));
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}

		System.out.println(map);
	}
}
