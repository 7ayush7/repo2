package com.learning.ayush.java8.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Program5 {

	public static void main(String[] args) {
		Stream.of("1", "A", "z", "Z", "B", "a").sorted().filter(a -> Pattern.matches("\\D", a)).sorted()
				.forEach(a -> System.out.println(a));
	}
}
