package com.learning.ayush.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@FunctionalInterface
interface Addition {
	int add(int a, int b);
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(4);
		e.execute(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});// Lambda Expression for Runnable Interface
		e.shutdown();
		System.out.println();
		Addition a = (a1, b1) -> a1 + b1;// one way
		Addition b = (int a2, int b2) -> {
			return a2 + b2;
		};// other way
		System.out.println(a.add(1, 2));
	}
}
