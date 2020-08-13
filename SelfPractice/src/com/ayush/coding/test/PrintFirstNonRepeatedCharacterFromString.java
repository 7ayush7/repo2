package com.ayush.coding.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrintFirstNonRepeatedCharacterFromString {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> e:map.entrySet()){
			if(e.getValue()==1){
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
