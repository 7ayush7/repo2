package com.amdocs.ayush.java8.stream;

import java.util.stream.IntStream;

/**
 * Task :
 * 
 * Given a list of numbers, 
 * square them and filter the numbers which are greater 100 and then find average of them
 * 
 * */
public class Program9 {

	public static void main(String[] args){
		IntStream.of(10,20,30,40,50,60,70)
		.map(a->a*a)
		.filter(a->a>100)
		.forEach(q->System.out.println(q));
	}
}
