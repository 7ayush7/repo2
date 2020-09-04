package com.learning.ayush.collections.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Student{
int id;
String name;

Student(){
	
}
Student(int id, String name){
	this.id=id;
	this.name=name;
}

public String toString(){
	return this.id+" "+this.name;
}
}

public class ComparatorExample {

	public static void main(String[] args){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1112212);
		list1.add(11211112);
		list1.add(212);
		list1.add(6);
		list1.add(4112212);
		list1.add(5512212);
		list1.add(32112212);
		
		//Requirement is to sort the list on basis of element present at 1st position or 0th index.
		//So out of 32323333, 121, 2 the sorted list will be as : 121, 2, 32323333
		Collections.sort(list1,(Integer o1, Integer o2)->{
			return o1.toString().charAt(0)>o2.toString().charAt(0)?1:o1.toString().charAt(0)<o2.toString().charAt(0)?-1:0;
		});
		
		System.out.println(list1);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(111, "Ayush"));
		list2.add(new Student(2, "test1"));
		list2.add(new Student(2323, "test2"));
		list2.add(new Student(23, "test3"));
		list2.add(new Student(334, "test4"));
		list2.add(new Student(1131, "test5"));
		list2.add(new Student(65, "test6"));
		list2.add(new Student(77, "test7"));

		Collections.sort(list2, (Student o1, Student o2)->{
			return o1.id>o2.id?1:o1.id<o2.id?-1:0;
			}
		);
		
		//When you dont want to make changes in the List Element, you always create a Comparator.
		//This way the main Element and its class implementation remains unchanged otherwise for 
		//same behavior we had to implement Comparator Interface and provide implementation in its compare method
		
		
		System.out.println();
		for(Student s : list2){
			System.out.println(s);
		}
	}
}
