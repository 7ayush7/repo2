package com.amdocs.ayush.java8;

@FunctionalInterface
interface i1{
	void m1();
}

//i2 does not have any abstract method of its own but as it extends i1 hence its abstract method will be used in i2
@FunctionalInterface
interface i2 extends i1{
	static void m2() {
	}
}

//You need to have atleast and atMax only one abstract method in functional interface
@FunctionalInterface
interface i3 extends i1{
	static void m3(){}
	default void m4(){}
}

public class FunctionalInterfaceExample {

	public static void main(String[] args){
		
		i1 a1 = FunctionalInterfaceExample::f1;
		//Same as : a1 = ()->f1();
		a1.m1();
		i2 a2 = new FunctionalInterfaceExample()::f2;
		//Same as : a2 = ()->new FunctionalInterfaceExample().f2();
		a2.m1();
	}
	
	public static void f1(){
		System.out.println("Inside static f1");
	}
	
	public void f2(){
		System.out.println("Inside f2");
	}
}
