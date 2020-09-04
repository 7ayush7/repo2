package com.learning.ayush.collections.designpattern.creationaldesignpattern;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Eager initialization
class SingletonEager {
	private static SingletonEager c = new SingletonEager();

	private SingletonEager() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonEager getInsatance() {
		System.out.println(c);
		return c;
	}
}

//Lazy initialization
class SingletonLazy {
	private static SingletonLazy c;

	private SingletonLazy() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonLazy getInsatance() {
		if (c == null) {
			c = new SingletonLazy();
			System.out.println(c);
			return c;
		}
		System.out.println(c);
		return c;
	}
}

//Synchronized Method
class SingletonSynchMethod {
	private static SingletonSynchMethod c;

	private SingletonSynchMethod() {
		// TODO Auto-generated constructor stub
	}

	public static synchronized SingletonSynchMethod getInsatance() {
		if (c == null) {
			c = new SingletonSynchMethod();
			System.out.println(c);
			return c;
		}
		System.out.println(c);
		return c;
	}
}

//Synchronized block
class SingletonSynchBlock {
	private static SingletonSynchBlock c;

	private SingletonSynchBlock() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonSynchBlock getInsatance() {
		if (c == null) {
			synchronized (SingletonSynchBlock.class) {
				if (c == null) {
					c = new SingletonSynchBlock();
					System.out.println(c);
					return c;
				}
			}
		}
		System.out.println(c);
		return c;
	}
}

public class SingteltonDesignPatternExample {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			SingletonEager.getInsatance();
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			SingletonLazy.getInsatance();
		}
		System.out.println();

		ExecutorService e1 = Executors.newFixedThreadPool(2);
		e1.execute(SingletonSynchMethod::getInsatance);
		e1.execute(SingletonSynchMethod::getInsatance);

		ExecutorService e2 = Executors.newFixedThreadPool(2);
		e2.execute(SingletonSynchBlock::getInsatance);
		e2.execute(SingletonSynchBlock::getInsatance);

		e1.shutdown();
		e2.shutdown();
	}

}
