package com.ayush.coding.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [1,2,3,4,5,6] -> [1,3,5]
 * 
 * */
public class DeleteAlternatingCharacters {

	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<list.size();i=i+2){
			list2.add(list.get(i));
		}
		System.out.println(list2);
	}
}
