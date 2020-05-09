package com.amdocs.ayush.miscellaneous;

class Test2{
	int balance;
	Test2(int balance){
		this.balance=balance;
	}
	
	public synchronized void debitAmount(int i) throws InterruptedException{
		while(i>=balance){
			System.out.println("Debit Amount - "+i+" is >= balance - "+balance+" hence waiting for credit");
			wait();
		}
		this.balance=this.balance-i;
		System.out.println("Current Balance after debit - "+this.balance);
	}
	
	public synchronized void creditAmount(int i){
		this.balance=this.balance+i;
		System.out.println("Current Balance after credit - "+this.balance);
		notifyAll();
	}
}
public class CreditDebitExample {

	public static void main(String[] args) throws InterruptedException{
		Test2 account = new Test2(10);
		Thread t1 = new Thread(()->{
			try {
				account.debitAmount(11);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		Thread t2 = new Thread(()->account.creditAmount(5));
		t2.start();
		
	}
}
