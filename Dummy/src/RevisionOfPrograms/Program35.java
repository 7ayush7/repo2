package RevisionOfPrograms;

//print 1 to 10 using 2 different threads
public class Program35 {

	public static void main(String[] args) throws InterruptedException {
		Print p = new Print();
		//p.isOdd=true;
		Thread t1= new Thread(()->{
			for(int i=1; i<10;i=i+2) {
				try {
					p.printOdd(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		Thread t2= new Thread(()->{
			for(int i=2; i<=10;i=i+2) {
				try {
					p.printEven(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
	}
	
}

class Print{
	boolean isOdd=true;
	
	synchronized void printEven(int num) throws InterruptedException {
		synchronized (this){
		if(isOdd) {
			wait();
		}
		System.out.println(num);
		isOdd=true;
		notify();
		}
	}
	
	synchronized void printOdd(int num) throws InterruptedException {
		synchronized (this){
		if(!isOdd) {
			wait();
		}
		System.out.println(num);
		isOdd=false;
		notify();
		
	}
		
	}
	
}