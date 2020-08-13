package Set1;

import java.util.ArrayList;
import java.util.List;

//Producer-Consumer Problem..
/*
 * here we will be creating a list of integer and then will call a put method to produce the data in the list
 * and also will call a get method to consume the data from the list.
 * All this shall happen one element at a time.
 * 
 * Say if the data is not present in the list the consumer shall wait for the producer to add data.
 * */
class X {
	List<Integer> list = new ArrayList<>();
	int min=0, max=1;

	synchronized void producerMethod(Integer i) throws InterruptedException{
		if(list.size()>=max){
			System.out.println("Cant add more as threshold for max 5 reached");
			System.out.println("list - producerMethod -"+this.list);
			System.out.println("waiting");
			wait();
		}
		list.add(i);
		System.out.println("List "+list);
		notifyAll();
	}
	synchronized void consumerMethod(Integer i) throws InterruptedException{
		if(list.size()<=min){
			System.out.println("Cant delete more as threshold for min 0 reached");
			System.out.println("list - producerMethod -"+this.list);
			System.out.println("waiting");
			wait();
		}
		list.remove(i);
		System.out.println("List "+list);
		notifyAll();
	}
}
class Test12{
	public static void main(String[] args) throws InterruptedException{
		X object = new X();		
		Thread t1 =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<10;i++){
					try {
						object.producerMethod(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t1.start();
		Thread t2 =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<10;i++){
					try {
						object.consumerMethod(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t2.start();

}
}
