package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,1,1,1,2,2,2,2,3,4,4,4,5,6,6,6,7,88,9);
		System.out.println(list);
		List<Integer> sortedList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//2nd way
		List<Integer> dupList = new ArrayList<>();
		sortedList=new ArrayList<Integer>();
		for(Integer i:list){
			if(!sortedList.contains(i)){
				sortedList.add(i);
			}
			else{
				if(!dupList.contains(i)){
					dupList.add(i);
				}
			}
		}
		System.out.println(sortedList);
		System.out.println(dupList);
	}
}
