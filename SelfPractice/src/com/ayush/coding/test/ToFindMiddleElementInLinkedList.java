package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToFindMiddleElementInLinkedList {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		if(list.size()%2==0){
			System.out.println(list.get((list.size()/2)-1));
			System.out.println(list.get((list.size()/2)));
		}
		else{
			System.out.println(list.get((list.size()/2)));
		}
	}
}
