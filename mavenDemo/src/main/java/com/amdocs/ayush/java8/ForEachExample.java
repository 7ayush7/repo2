package com.amdocs.ayush.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args){
		List<String> list = Arrays.asList("Ayush","test1","test2","testN");
		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};//this is same as :
		Consumer<String> c2 = t->System.out.println(t);
		
 		list.forEach(t->System.out.println(t));
	}
}
