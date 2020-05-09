package com.amdocs.ayush.miscellaneous;

public class DeadlockExample {

	public static void main(String[] args){
		String t1 = "A";
		String t2 = "B";
		Thread th1 = new Thread(()->{
			synchronized (t1) {
				System.out.println(Thread.currentThread().getName()+" attained lock on monitor "+t1);
				synchronized (t2) {
					System.out.println(Thread.currentThread().getName()+" attained lock on monitor "+t2);
				}
			}
		});
		Thread th2 = new Thread(()->{
			synchronized (t2) {
				System.out.println(Thread.currentThread().getName()+" attained lock on monitor "+t2);
				synchronized (t1) {
					System.out.println(Thread.currentThread().getName()+" attained lock on monitor "+t1);
				}
			}
		});
		th1.start();
		th2.start();
	}
}
