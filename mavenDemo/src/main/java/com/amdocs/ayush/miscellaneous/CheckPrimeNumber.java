package com.amdocs.ayush.miscellaneous;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args){
		System.out.println("Enter the number to check whether its prime or not :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//Prime number : A number divisible by itself and 1 only
		boolean isPrime = true;
		if(num<2){
			isPrime=false;
		}
		for(int i=num;i>1;i--){
			if(num%i==0 && i!=num){
				isPrime=false;
			}
		}
		System.out.println(num+" isPrime : "+isPrime);
	}
}
