package com.amdocs.ayush.objectclone;

public class ObjectCloningExample {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		ClassA classA = new ClassA(1, "Ayush");
		ClassB classB = new ClassB("test", classA);
		
		ClassB classBB = (ClassB) classB.clone();
		System.out.println(classBB);
		classA.setName("Ayushhhhh");
		System.out.println(classBB);
	}
}
