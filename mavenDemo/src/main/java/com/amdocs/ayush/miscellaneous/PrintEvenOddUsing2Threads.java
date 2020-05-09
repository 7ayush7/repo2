package com.amdocs.ayush.miscellaneous;

class Test{
	boolean printingOdd = true;

	public void printOdd(int i) throws InterruptedException{
		synchronized (this) {
			while(!printingOdd){
				wait();
			}
			System.out.println(i);
			printingOdd=false;
			notifyAll();
		}
	}
	public void printEven(int i) throws InterruptedException{
		synchronized (this) {
			while(printingOdd){
				wait();
			}
			System.out.println(i);
			printingOdd=true;
			notifyAll();
		}
	}
}
public class PrintEvenOddUsing2Threads {

	public static void main(String[] args){
		Test t = new Test();
		Thread t1 = new Thread(()->{for(int i=1;i<10;i=i+2){
			try {
				t.printOdd(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		Thread t2 = new Thread(()->{for(int i=2;i<11;i=i+2){
			try {
				t.printEven(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		t1.start();
		t2.start();
	}
}
