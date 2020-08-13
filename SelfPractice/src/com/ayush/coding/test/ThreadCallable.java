package com.ayush.coding.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService e1 = Executors.newCachedThreadPool();
		Future<Integer> f =e1.submit(()->{
			Thread.sleep(2000);
			return 7;
		});
		System.out.println("Waiting for 2 secs");
		int t = f.get();
		System.out.println("Executed");
		System.out.println(t);
		e1.shutdown();
	}
	
}
