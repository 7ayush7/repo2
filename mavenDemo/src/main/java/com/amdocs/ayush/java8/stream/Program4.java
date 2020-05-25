package com.amdocs.ayush.java8.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Program4 {

	public static void main(String[] args){
		OptionalDouble average = IntStream.range(1, 10).average();
		System.out.println(average.getAsDouble());
	}
}
