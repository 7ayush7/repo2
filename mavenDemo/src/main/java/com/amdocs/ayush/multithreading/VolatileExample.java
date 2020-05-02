package com.amdocs.ayush.multithreading;

import java.io.DataInputStream;
import java.io.IOException;

/*
 * Volatile Theory :
 * 
 * If there are multiple threads, then in that case accessing the values of shared variable from main memory
 * can lead to memory issues. So for that case. Each thread gets assigned a separate stack.
 * Each stack has its own cache of variables. These threads make changes in these caches.
 * So it may happen that if some other thread has made changes in variable x which is used by other thread as well
 * then this new change might not be readily available to all the threads in pool.
 * Its job of JVM to refresh these caches regularly with main memory, so that there should be consistency
 * But its mainly depend upon configuration of your system that how regularly JVM will refresh these caches.
 * To make sure that happens, we add volatile keyword with these values. So that the data gets refreshed regularly.
 * 
 * Just to highlight that even without adding volatile, everything might work just fine.
 * volatile keyword gives you surety that this refresh must happens
 * */
public class VolatileExample {

	boolean flag = true;//The flag variable in general which are directly accessed and changed by 
	//Threads, must be put as volatile, so that JVM must always refreshed the cache memory of the thread
	//with the main memory, so that there must be consistency
	
	int counter = 0;
	 
	public static void main(String[] args) throws InterruptedException{
		
		VolatileExample v = new VolatileExample();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (v.flag) {
					v.counter++;
					System.out.println(v.counter+" "+v.flag);		
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				DataInputStream din = new DataInputStream(System.in);
				try {
					String input = din.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				v.flag=false;
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
