package com.amdocs.ayush.java8.stream;

import java.util.stream.IntStream;

public class Program2 {

	public static void main(String[] args){
		IntStream.range(1, 10).skip(2).forEach(a->System.out.println(a));
	}
}
