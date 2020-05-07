package com.amdocs.ayush.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return this.id+" "+this.name;
	}
}
public class StreamsExample {

	public static void main(String[] args){
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = list.stream().filter((t)->(t>4)).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Student> list3 = Arrays.asList(new Student(1, "test1"),new Student(2, "test2"),
				new Student(3, "test3"),new Student(4, "test4"), new Student(4, "test4"));
		List<String> list4 = list3.stream().filter(p->p.id>2).map(p->p.name).collect(Collectors.toList());
		System.out.println(list4);
		
		boolean flag = list3.stream().allMatch(p->p.id>0);
		System.out.println(flag);
		
		System.out.println(list3.stream().anyMatch(p->p.name.contains("t")));
		List<Student> list5 = list3.stream().distinct().collect(Collectors.toList());
		System.out.println(list5);
	}
}
