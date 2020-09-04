package com.learning.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test1 {
	List<Integer> list;
	int max;
	int min;

	Test1() {
		this.list = new ArrayList<>();
		this.max = 3;
		this.min = 0;
	}

	synchronized void producerMethod(Integer i) throws InterruptedException {
		while (list.size() >= max) {
			System.out.println("Size >= max, hence waiting");
			wait();
		}
		list.add(i);
		System.out.println(this.list);
		notifyAll();
	}

	synchronized void consumerMethod(Integer i) throws InterruptedException {
		while (list.size() <= min) {
			System.out.println("Size <= min, hence waiting");
			wait();
		}
		list.remove(i);
		System.out.println(this.list);
		notifyAll();
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] arg) {
		Test1 t = new Test1();
		Thread t1 = new Thread(() -> {
			for (Integer i = 0; i < 5; i++) {
				try {
					t.producerMethod(i);
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			for (Integer i = 0; i < 5; i++) {
				try {
					t.consumerMethod(i);
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t2.start();
	}
}
