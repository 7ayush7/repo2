package com.ayush.coding.test;

class T{
	T(){
		System.out.println("T");
	}
}

class T1 extends T{
	T1(){
		System.out.println("T1");
	}
}

class T2 extends T1{
	int id;
	T2(){
		System.out.println("T2");
	}
	T2(int id){
		System.out.println("T2 : "+id);
	}
}
public class SuperConstructorExample {

	public static void main(String[] args){
		T2 t = new T2(1);
	}
}
