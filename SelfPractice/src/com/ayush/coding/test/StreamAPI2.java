package com.ayush.coding.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI2 {

	public void printDetails(Stream<String> s,String str) throws InterruptedException{
		s.forEach(a->System.out.println(Thread.currentThread().getName()+" "+a+" "+str));
		Thread.sleep(100);
	}
	public static void main(String[] args){
		StreamAPI2 obj = new StreamAPI2();
		String s[] = {"0","1","2","3","4","5","6","7","8","9"};
		Stream<String> parallel = Arrays.stream(s).parallel();
		Stream<String> sequential = Arrays.stream(s).sequential();
		
		Thread t1 = new Thread(()->{
			try {
				obj.printDetails(parallel,"parallel");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		

		Thread t2 = new Thread(()->{
			try {
				obj.printDetails(sequential,"sequential");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
	}
}
