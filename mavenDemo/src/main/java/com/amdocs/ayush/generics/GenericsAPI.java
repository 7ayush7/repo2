package com.amdocs.ayush.generics;

import java.util.ArrayList;
import java.util.List;


class GenericsExample <T extends Number>{//This is a generics of type T that must extend Number class, So in that way you can have Generics example of type Float, Double and Integer
	T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public void printData(List<? extends String> data){//? is called as wildcards, it can be used as ? extends or ? super .. etc
		System.out.println(data);
	}
}

public class GenericsAPI {

	public static void main(String[] args){
		List t = new ArrayList();
		t.add(1);
		t.add("WrongData");
		
		for(Object e : t){
			//Integer value = Integer.valueOf(e.toString());
			//System.out.println(value);//Results into an error for added String object in list, NumberFormatException
		}
		
		List<Integer> t2 = new ArrayList<Integer>();
		t2.add(1);
		//t2.add("dd");//Gives compile time error that cant add this String element in a list of genericType Integer
		GenericsExample<Integer> example = new GenericsExample();
		example.setObject(1);
		example.getObject();
		List<String> list = new ArrayList<String>();
		list.add("Ayush");
		example.printData(list);
		
	}
}
