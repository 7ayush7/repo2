package com.learning.ayush.miscellaneous;

class Test3 {
	int num = 1;
	int threshold = 10;

	public synchronized void printSequence(int rem) throws InterruptedException {
		while (num < threshold - 1) {
			while (num % 3 != rem) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + " " + num);
			num++;
			notifyAll();
		}
	}
}

public class PrintSequenceUsing3Threads {

	public static void main(String[] args) {
		Test3 t = new Test3();
		Thread t1 = new Thread(() -> {
			try {
				t.printSequence(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T1");
		Thread t2 = new Thread(() -> {
			try {
				t.printSequence(2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T2");
		Thread t3 = new Thread(() -> {
			try {
				t.printSequence(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T3");
		t1.start();
		t2.start();
		t3.start();

	}
}
