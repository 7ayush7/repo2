package com.ayush.coding.test;


public class DeadlockExample {

	static String s1 = "A";
	static String s2 = "B";
		
	public static void main(String[] args){
		DeadlockExample d = new DeadlockExample();
		Thread t1 = new Thread(()->{
			synchronized (s1) {
				System.out.println(Thread.currentThread().getName()+" "+s1);
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+" "+s2);
				}
			}
		
		});
		Thread t2 = new Thread(()->{
			synchronized (s2) {
				System.out.println(Thread.currentThread().getName()+" "+s2);
				synchronized (s1) {
					System.out.println(Thread.currentThread().getName()+" "+s1);
				}
			}
		});
		t1.start();
		t2.start();
	}
}
