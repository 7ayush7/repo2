package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedListInPairs {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> revF = new ArrayList<>();

		for(int i=0;i<list.size();i=i+2){
				List<Integer> rev = new ArrayList<>();
				rev.add(list.get(i));
				rev.add(list.get(i+1));
				Collections.sort(rev, Collections.reverseOrder());
				revF.addAll(rev);
		}
		System.out.println(revF);
	}
}
