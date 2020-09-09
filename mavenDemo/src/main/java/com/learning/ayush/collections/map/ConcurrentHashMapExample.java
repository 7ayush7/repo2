package com.learning.ayush.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

class Test {
	//Map<Integer,Integer> c = Collections.synchronizedMap(new HashMap<>());//here
	// changing the map to HashMap will throw an error
	Map<Integer, Integer> c = new ConcurrentHashMap<>();
	//Map<Integer,Integer> c = new HashMap<>();
	 synchronized void update(int from, int to) throws InterruptedException {
		for (int i = from; i < to; i++) {
			c.put(i, i);
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class ConcurrentHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Test t = new Test();
		Thread t1 = new Thread(() -> {
			try {
				t.update(0, 50);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		t1.start();
		Thread t2 = new Thread(() -> {
			try {
				t.update(0, 500);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		t2.start();
//		for(Integer e:t.c.keySet()){
//			System.out.println("Key :"+e);
//			//t.c.put(999, 999);
//		}
		Iterator<Entry<Integer, Integer>> i = t.c.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println("Key :" + i.next().getKey());
			t.c.put(999, 999);
		}
		System.out.println(t.c);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
