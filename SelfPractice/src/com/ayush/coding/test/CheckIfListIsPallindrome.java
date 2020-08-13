package com.ayush.coding.test;

import java.util.Arrays;
import java.util.List;

public class CheckIfListIsPallindrome {

	static boolean flag=true;
	static void checkpallindromeList(List list){

		for(int i=0;i<list.size();i++){
			if(!list.get(i).equals(list.get(list.size()-1-i))){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Pallindrome List");
		}
		
	}
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1,1,2,2,3,2,2,1,1);
		List<String> list2 = Arrays.asList("a","a","a","b","a","a","a");

		checkpallindromeList(list2);

		
		
	}
}
