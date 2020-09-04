package com.learning.ayush.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test {
	volatile boolean flag = false;

	void setFlagTrue() {
		flag = true;
		System.out.println("Setting Freak Alive");
	}

	void getFlag() {
		if (flag) {
			System.out.println("Hi Freak!");
		}
	}
}

public class VolatileExample3 {

	public static void main(String[] args) {
		Test t = new Test();
		ExecutorService s = Executors.newFixedThreadPool(2);
		s.execute(t::setFlagTrue);
		s.execute(t::getFlag);
		s.shutdown();
//		Thread t1 = new Thread(t::setFlagFalse);
//		Thread t2 = new Thread(t::getFlag);
//		t1.start();
//		t2.start();
	}
}
