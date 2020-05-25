package com.amdocs.ayush.java8.stream;

import java.util.stream.Stream;

public class Program6 {

	public static void main(String[] args){
		Stream.of("Ayush","test1","test2")
		.sorted().findAny().ifPresent(System.out::println);
	}
}
