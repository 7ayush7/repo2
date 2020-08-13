package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args){
		List<String> list = Arrays.asList("a","a","a","a","a","b","b");
		List<String> dup = new ArrayList<String>();
		list.stream().distinct().forEach(a->System.out.println(a));
		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);
		for(String s:list){
			if(!dup.contains(s)){
				dup.add(s);
			}
		}
		System.out.println(dup);
	}
}
