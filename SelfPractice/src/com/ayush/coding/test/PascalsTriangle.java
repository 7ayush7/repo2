package com.ayush.coding.test;

import java.util.Scanner;

/**
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * */
public class PascalsTriangle {

	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int spaces = num;
		int first = 1;
		for(int i=0;i<num;i++){
			first=1;
			for(int j=0;j<=i;j++){
				System.out.print(first+" ");
				first = first * (i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
