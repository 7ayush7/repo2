package RevisionOfPrograms;

public class TestThread implements Runnable{

	public static void main(String[] args){
		for(int i=0;i<10;i++){
			new Thread(new TestThread()).start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		System.out.println("Run method executed : "+Thread.currentThread().getName());
	}
}
