package RevisionOfPrograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread2 implements Runnable{

	public static void main(String[] args){
		ExecutorService e = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
			e.execute(new TestThread2());
		}
		e.shutdown();
	}

	@Override
	public void run() {
		for(int i=0;i<7;i++){
			System.out.println("Run method executed : "+" i = "+i+" : "+Thread.currentThread().getName());
		}
	}
	
}

