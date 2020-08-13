package com.ayush.coding.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args){
		List<Integer> list = new java.util.LinkedList<>(Arrays.asList(1,1,2,44,55,7));
		List<Integer> rev = new LinkedList<Integer>();
		for(int i=list.size()-1;i>=0;i--){
			rev.add(list.get(i));
		}
		System.out.println(rev);
	}
}
