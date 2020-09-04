package com.learning.ayush.multithreading;

public class VolatileExample2 {

	volatile int counter;// The counter variables must always be put as volatile and corresponding
							// methods
	// must be always synchronized

	synchronized int increaseCounter() {
		counter = counter + 1;
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return counter;
	}

	public static void main(String[] args) throws InterruptedException {

		VolatileExample2 v = new VolatileExample2();

		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " " + v.increaseCounter());
		});

		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " " + v.increaseCounter());
		});
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " " + v.counter);

	}
}
