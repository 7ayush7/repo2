package Set1;

//Checking the DeadLock condition
//Will create 2 String Object and ask thread 1 to occupy lock for these 2 objects one by one
//And then similary ask other thread to do the opposite
//This will lead to a Thread DeadLock Situation
public class Test18 {

	public static void main(String... args){

		final String object1 = "A";
		final String object2 = "B";
		
		Thread t1 = new Thread(()->{
			synchronized (object1) {
				System.out.println(Thread.currentThread().getName() + " A");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (object2) {
					System.out.println(Thread.currentThread().getName() + " B");
				}
			}
			});
		Thread t2 = new Thread(()->{
			synchronized (object2) {
				System.out.println(Thread.currentThread().getName() + " B");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (object1) {
					System.out.println(Thread.currentThread().getName() + " A");
				}
			}
		});
		t1.start();
		t2.start();
	}
}