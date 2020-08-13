package com.ayush.coding.test;

import java.util.stream.IntStream;

public class StreamAPI1 {
	
	public static void main(String[] args){
		IntStream.of(-100,1,100,23,0).sorted().forEach(System.out::println);
	}

}
