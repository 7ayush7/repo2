package com.ayush.coding.test;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args){
		boolean flag= true;
		int num = new Scanner(System.in).nextInt();
		if(num<2){
			flag=false;
		}
		else{
			for(int i=2;i<num;i++){
				if(num%i==0 && i!=num){
					flag=false;
					break;
				}
			}
		}
		System.out.println("Is Prime - "+flag);
	}
}
