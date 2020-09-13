package java8.ayush.assignment1;

/**
 * @author ayush.singh
 * 
 * Java concurrency : Assignment 1
 * 
•	You have a server where we need to populate 3 caches from Databases. This scenario need to be simulated without using executor service.
•	You can use main class as your server. for DB connection just use sleep for 40 sec.

 * */

class DB{
	volatile int counter = 0;
	public void populateCache() {
		System.out.println("Waiting for DB Connection to happen : "+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB Connected : "+Thread.currentThread().getName());
		counter++;
		System.out.println("Cache for thread : "+Thread.currentThread().getName());
		System.out.println("total cache retrived : "+counter+" : "+Thread.currentThread().getName());
	}
}
public class Main {

	public static void main(String[] args) {
		DB dbConnection = new DB();
		
		Thread t1 = new Thread(()->{
			dbConnection.populateCache();
		});
		Thread t2 = new Thread(()->{
			dbConnection.populateCache();
		});
		Thread t3 = new Thread(()->{
			dbConnection.populateCache();
		});
		t1.start();t2.start();t3.start();
	}
}
