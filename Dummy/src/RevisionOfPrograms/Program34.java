package RevisionOfPrograms;

//Bank Problem of Credit/Debit : By use of wait() and notify()
public class Program34 {

	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1= new Thread(()-> {
			try {
				b.debitAmount(1000);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		t1.start();
		
		Thread t2= new Thread(()-> {
			try {
				b.creditAmount(1000);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		t2.start();
	}
}

class Bank{
	int amount;
	
	Bank(){
		this.amount=100;
	}
	
	synchronized void debitAmount(int amount) throws InterruptedException    {
		if(amount>this.amount) {
			System.out.println("Low bank balance ... waiting for deposit");
			wait();
		}
		this.amount=this.amount-amount;
		System.out.println("Amount Debitted ... Current available balance : "+this.amount);
		notifyAll();
	}
	
	synchronized void creditAmount(int amount) throws InterruptedException    {
		this.amount=this.amount+amount;
		System.out.println("Amount Creditted ... Current available balance : "+this.amount);
		notifyAll();
	}
}

