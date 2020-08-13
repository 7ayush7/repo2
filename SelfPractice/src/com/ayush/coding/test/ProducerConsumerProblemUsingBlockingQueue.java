package com.ayush.coding.test;

import java.util.concurrent.ArrayBlockingQueue;

class ProduceConsumeQueue{
	ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(1);
	
	void produce(int i) throws InterruptedException{
		q.put(i);
		System.out.println(q);
	}
	void consume(int i) throws InterruptedException{
		q.take();
		System.out.println(q);
	}
}
public class ProducerConsumerProblemUsingBlockingQueue {

	public static void main(String[] args){
		ProduceConsumeQueue q = new ProduceConsumeQueue();
		Thread t1 = new Thread(()->{
			for(int i=0;i<10;i++){
				try {
					q.produce(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<10;i++){
				try {
					q.consume(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
