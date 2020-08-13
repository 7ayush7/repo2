package com.ayush.coding.test;

class EvenOdd{
	boolean isPrintingOdd=true;
	
	void printEven(int i) throws InterruptedException{
		synchronized (this) {
			while(isPrintingOdd){
				wait();
			}
			System.out.println(i);
			isPrintingOdd=true;
			notifyAll();
		}
	}
	
	void printOdd(int i) throws InterruptedException{
		synchronized (this) {
			while(!isPrintingOdd){
				wait();
			}
			System.out.println(i);
			isPrintingOdd=false;
			notifyAll();
		}
	}
}
public class PrintEvenOddUsing2Threads {

	public static void main(String[] args){
		EvenOdd obj = new EvenOdd();
		Thread t1 = new Thread(()->{
			for(int i=1;i<10;i=i+2){
				try {
					obj.printOdd(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=2;i<=10;i=i+2){
				try {
					obj.printEven(i);
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
