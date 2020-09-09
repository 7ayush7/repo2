package com.learning.ayush.miscellaneous;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newCachedThreadPool();
		Future<String> f = e.submit(()->{
			Thread.sleep(1000);
			return "Hello!";
		});
		System.out.println("Waiting");
		System.out.println(f.get());
		System.out.println("Waiting");
		e.shutdown();
	}
}
