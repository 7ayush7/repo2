package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToFindNthElementFromEndOfLinkedList {

	public static void main(String[] arg){
		List<String> list = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7"));
		int index = new Scanner(System.in).nextInt();
		if(index>=list.size()){
			System.out.println("Invalid index");
		}
		System.out.println(list.get(list.size()-1-index));
	}
}
