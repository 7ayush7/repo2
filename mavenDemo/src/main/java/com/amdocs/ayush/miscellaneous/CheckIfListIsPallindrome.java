package com.amdocs.ayush.miscellaneous;

import java.util.Arrays;
import java.util.List;

public class CheckIfListIsPallindrome {

	public static void main(String[] args){
		boolean isPallindrome = false;
		List<Integer> list = Arrays.asList(1,2,3,4,3,2,1,1,1);
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(list.get(list.size()-1-i))){
				isPallindrome=true;
			}
		}
		System.out.println("Is Pallindrome : "+isPallindrome);
		System.out.println(list);
		
	}
}
