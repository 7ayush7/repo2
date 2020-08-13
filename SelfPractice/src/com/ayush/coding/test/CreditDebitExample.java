package com.ayush.coding.test;

/**
 * Bank Credit Debit Example
 * */

class Bank{
	int balance;
	
	Bank(int balance){
		this.balance=balance;
	}
	
	public void debit(int amount) throws InterruptedException{
		synchronized (this) {
			while(amount>balance){
				System.out.println("You dont have enough balance, please credit");
				wait();
			}
			this.balance=this.balance-amount;
			System.out.println(this.balance);
			notifyAll();
		}
	}
	
	public synchronized void credit(int amount){
		this.balance=this.balance+amount;
		System.out.println(this.balance);
		notifyAll();
	}
}
public class CreditDebitExample {

	public static void main(String[] args){
		Bank b = new Bank(10);
		Thread t1 = new Thread(()->{
			for(int i=7;i<30;i++){
				try {
					b.debit(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(()->{
			for(int i=7;i<30;i++){
				try {
					b.credit(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
	}
}
