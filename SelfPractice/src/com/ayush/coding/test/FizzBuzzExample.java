package com.ayush.coding.test;
/**
 * for 1 to 100
 * if number divisible by 3 - Fizz
 * if number divisible by 5 - Buzz
 * if by both - FizzBuzz
 * else Print number
 * */
public class FizzBuzzExample {

	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%3==0){
				if(i%5==0){
					System.out.println("FizzBuzz "+i);
				}
				else{
					System.out.println("Fizz "+i);
				}
			}
			else if(i%5==0){
				System.out.println("Buzz "+i);
			}
			else{
				System.out.println(i);
			}
		}
	}
}
