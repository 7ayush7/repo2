package com.amdocs.ayush.instanceofexample;

class Parent{
	
}

class Child extends Parent{

	void childMethod(){
		System.out.println("Child Method");
	}
}

public class InstanceOfExample {
	
	static void dummyMethod(Parent p){
		if(p instanceof Parent){
			Child c = (Child) p;
			c.childMethod();
		}
	}
	public static void main(String[] args){
		Parent parent = new Child();
		dummyMethod(parent);
		
	}
}
