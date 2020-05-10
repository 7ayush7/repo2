package com.amdocs.ayush.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.ToIntFunction;
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
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,1);
		System.out.println(list);
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		System.out.println(list.stream().collect(Collectors.toSet()));
		
		List<Integer> dummyList = Arrays.asList(1000,1000,2222,121212);
		OptionalDouble avg = dummyList.stream().mapToInt(n->n*n).filter(t->t>1000).average();
		if(avg.isPresent()){
			System.out.println(avg);
		}
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
		
		HashMap<Student,Integer> map = new HashMap<>();
		map.put(new Student(1, "A"), 1);
		map.put(new Student(1, "A"), 2);
		
		map.forEach((a,b)->System.out.println(a.id+" "+b));

		System.out.println();
		System.out.println();
		List<Integer> list6 = Arrays.asList(1,1,1,2,3,4,5,6,6,7,8);
		list6.stream().distinct().filter(s->s>3).map(a->a).collect(Collectors.toList()).forEach(a->System.out.println(a));
	
	}
}
