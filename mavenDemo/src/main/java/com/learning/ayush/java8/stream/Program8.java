package com.learning.ayush.java8.stream;

import java.util.stream.IntStream;

/**
 * Task :
 * 
 * Given the list of numbers, remove the duplicate elements from the list
 * 
 */
public class Program8 {

	public static void main(String[] args) {
		IntStream.of(1, 1, 1, 2, 2, 2, 3, 4, 5).distinct().forEach(a -> System.out.println(a));
	}
}
