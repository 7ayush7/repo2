package com.amdocs.ayush.collections.designpattern.structuraldesignpattern;

interface Country{
	void countryName();
}

class India implements Country{

	@Override
	public void countryName() {
		System.out.println("This is India");
	}
	
}

class America implements Country{

	@Override
	public void countryName() {
		System.out.println("This is USA");
	}
	
}

class Facade{
	
	public static void countryName(String code){
		if(code.equals("ind")){
			new India().countryName();
		}
		else if(code.equals("us")) {
			new America().countryName();
		}
	}
}
public class FacadeDesignPatternExample {

	public static void main(String[] args){
		Facade.countryName("ind");
		Facade.countryName("us");
	}
}
