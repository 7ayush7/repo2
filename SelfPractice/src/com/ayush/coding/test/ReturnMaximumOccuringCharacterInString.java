package com.ayush.coding.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class ReturnMaximumOccuringCharacterInString {

	public static void main(String[] args){
	String s = new Scanner(System.in).nextLine();
	int max=0;
	char t=' ';
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
		if(max<e.getValue()){
			max=e.getValue();
			t=e.getKey();
		}
	}
	System.out.println(t);
	System.out.println(max);
}
}