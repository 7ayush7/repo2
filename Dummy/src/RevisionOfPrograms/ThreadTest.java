package RevisionOfPrograms;

public class ThreadTest {

	public static void main(String[] args){
		run1();
		run2();
		run3();
	}
	private static synchronized void printNumbers(){
		for(int i=0;i<10000;i++){
			
			System.out.println("Thread : "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
	private static void createThread(Runnable r){
		Thread t = new Thread(r);
		t.start();
	}
	private static void run1(){
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				printNumbers();
			}
		};
		createThread(r);
	}
	private static void run2(){
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				printNumbers();
			}
		};
		createThread(r);
	}
	private static void run3(){
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				printNumbers();
			}
		};
		createThread(r);
	}
}
