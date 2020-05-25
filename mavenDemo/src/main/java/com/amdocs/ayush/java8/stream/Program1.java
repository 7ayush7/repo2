package com.amdocs.ayush.java8.stream;

import java.util.stream.IntStream;

public class Program1 {

	public static void main(String[] args){
		IntStream.range(0, 10).forEach(System.out::println);
	}
}
