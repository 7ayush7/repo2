package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProduceConsume{
	int min=1;
	int max=5;
	List<Integer> list;
	
	public ProduceConsume() {
		list = new ArrayList<Integer>(Arrays.asList(1,2,3));
	}
	void produce(int i) throws InterruptedException{
		synchronized (this) {
			while(list.size()>=max){
				System.out.println(list);
				wait();
			}
			this.list.add(Integer.valueOf(i));
			System.out.println(list);
			notifyAll();
		}
	}
	void consume(int i) throws InterruptedException{
		synchronized (this) {
			while(list.size()<=min){
				System.out.println(list);
				wait();
			}
			this.list.remove(Integer.valueOf(i));
			System.out.println(list);
			notifyAll();
		}
	}
}
public class ProducerConsumerProblem {

	public static void main(String[] args){
		ProduceConsume p = new ProduceConsume();
		Thread t1 = new Thread(()->{
			for(int i=0;i<10;i++){
				try {
					p.produce(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<10;i++){
				try {
					p.consume(i);
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
