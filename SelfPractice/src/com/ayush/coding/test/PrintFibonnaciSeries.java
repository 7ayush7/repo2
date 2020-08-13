package com.ayush.coding.test;

import java.util.Scanner;

// 1 1 2 3 5 8 13 21 ...
public class PrintFibonnaciSeries {

	public static void main(String[] args){
		int length = new Scanner(System.in).nextInt();
		int first = 1;
		int next = 1;
		int temp = 0;
		System.out.println(first);
		System.out.println(next);
		for(int i=0;i<length-2;i++){
			temp = first;
			first = next;
			next = temp+first;
			System.out.println(next);
		}
	}
}
