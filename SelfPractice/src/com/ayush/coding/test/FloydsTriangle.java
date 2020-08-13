package com.ayush.coding.test;

import java.util.Scanner;

/**
 * Floyds Triangle
 * 1
 * 23
 * 456
 * 789
 * */
public class FloydsTriangle {

	public static void main(String[] args){
		
		int num = new Scanner(System.in).nextInt();
		int spaces = num;
		int number=1;
		for(int i=1;i<=num;i++){			
			for(int j=1;j<=spaces;j++){
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			spaces--;
		}
	}
}
