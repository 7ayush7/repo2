package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Producer-Consumer Problem
//Create a List of Integer, and create 2 threads, one to add details in it, another to remove details from it
//Minimum threshold being 0 entry in List
//Maximum being 5
public class Program33 {

	public static void main(String[] args) {
		Dummy d = new Dummy();
		Thread t1 = new Thread(()-> {
			for(int i=0;i<7;i++) {
				try {
					d.addDataToList(i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		Thread t2 = new Thread(()-> {
			for(int i=0;i<7;i++) {
				try {
					d.removeDataFromList(i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
	}

}

class Dummy{
	List<Integer> list = new ArrayList<>();
	int min=0, max=5;
	
	synchronized void addDataToList(Integer i) throws InterruptedException {
		if(list.size()>=max) {
			System.out.println("Cant add more, maximum threshold size (5) of list is reached, waiting till remove method is called");
			wait();
		}
		list.add(i);
		System.out.println("List after adding "+i+" is :"+list);
		notifyAll();
	}
	synchronized void removeDataFromList(Integer i) throws InterruptedException {
		if(list.size()<=min) {
			System.out.println("Cant delete more, min threshold size (0) of list is reached, waiting till add method is called");
			wait();
		}
		list.remove(i);
		System.out.println("List after removing "+i+" is :"+list);
		notifyAll();
	}
}
