package com.amdocs.ayush.multithreading.deadlock;

public class DeadlockExample {

	public static void main(String[] args){
		String s1 = "a";
		String s2 = "b";
		
		Thread t1 = new Thread(()->{
			synchronized(s1){
				System.out.println(Thread.currentThread().getName()+"Lock on s1");
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+"Lock on s2");					
				}
			}
			});
		
		Thread t2 = new Thread(()->{
			synchronized(s2){
				System.out.println(Thread.currentThread().getName()+"Lock on s2");
				synchronized (s1) {
					System.out.println(Thread.currentThread().getName()+"Lock on s1");					
				}
			}
			});
		
		t1.start();
		t2.start();
	}
}
