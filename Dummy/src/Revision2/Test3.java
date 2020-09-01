package Revision2;

class R implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new R());
		t1.start();
		new R().run();
	}
	
}
