package com.ayush.coding.test;

import java.util.Scanner;

public class PrintingDifferentStarPatterns {

	public static void main(String[] args){
		int length = new Scanner(System.in).nextInt();
		int spaces = length;
		for(int i=0;i<length;i++){
			for(int k=0;k<spaces;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
	}
}
