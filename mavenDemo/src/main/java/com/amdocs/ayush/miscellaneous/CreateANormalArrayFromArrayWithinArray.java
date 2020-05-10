package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class CreateANormalArrayFromArrayWithinArray {
	public static void BreakingTheArray(Object obj,List<Object> finalList){
		if(obj instanceof List<?>){
			List<Object> dumList = (List<Object>) obj;
			for(int i=0;i<dumList.size();i++){
				BreakingTheArray(dumList.get(i),finalList);
			}
		}
		else{
			finalList.add(obj);
		}
	}
	
	public static void main(String[] args){
		List<Object> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		List<Object> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list1.add(list2);
		List<Object> list3 = new ArrayList<>();
		list3.add(1);
		list2.add(list3);
		System.out.println(list1);
		
		List<Object> finalList = new ArrayList<>();
		for(Object o:list1){
			BreakingTheArray(o,finalList);
		}
		System.out.println(finalList);
	}

}
