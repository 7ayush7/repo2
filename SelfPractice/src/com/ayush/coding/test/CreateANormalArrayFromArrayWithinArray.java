package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [1,1,1,[1,1,[1]]] --->> [1,1,1,1,1,1]
 * 
 * */
public class CreateANormalArrayFromArrayWithinArray {

	static List breakTheArray(List<Object> list1,List<Object> ret){
		for(int i=0;i<list1.size();i++){
		
			if(list1.get(i) instanceof List<?>){
				List<Object> t = (List<Object>) list1.get(i);
				breakTheArray(t,ret);
			}
			else{
				ret.add((Integer) list1.get(i));
			}
		}
		return ret;
	}
	public static void main(String[] args){
		List<Object> list2 = Arrays.asList(1,1,1);
		List<Object> list3 = Arrays.asList(2);

		List<Object> list1 = new ArrayList<Object>();
		list1.add(list2);
		list1.add(list3);
		list1.add(7);
		System.out.println(list1);
		List<Object> ret = new ArrayList<>();
		List t = breakTheArray(list1,ret);
		System.out.println(t);
		
	}
}
