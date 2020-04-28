package com.amdocs.ayush.collections.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6760035738785670939L;
	int id;
	String name;
	
	Student(){}
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return this.id+" "+this.name;
	}
}

public class HashSetExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		
		List<Integer> list1 = new ArrayList<Integer>(set1);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		
		set1.addAll(list1);
		
		HashSet<Integer> set2 = new HashSet<Integer>(list1);
		for(Integer i:set2){
			System.out.print(i);
		}
		HashSet<Integer> set3 = (HashSet<Integer>) set2.clone();
		System.out.println(set3);
		
		Iterator<Integer> iterate = set3.iterator();
		while(iterate.hasNext()){
			Integer data = iterate.next();
			if(data.equals(2)){
				iterate.remove();
			}
		}
		Integer[] array = new Integer[set3.size()];
		array = set3.toArray(array);
		for(int i:array){
			System.out.print(i);
		}
		List<Integer> list2 = Arrays.asList(array);
		System.out.println(set3);
		System.out.println(list2);
		
		HashSet<Student> set4 = new HashSet<Student>();
		set4.add(new Student(1, "Ayush"));
		set4.add(new Student(2, "Animesh"));
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test2.txt"));
		out.writeObject(set4);
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("test2.txt"));
		Set<Student> set = (Set<Student>) oin.readObject();
		
		System.out.println(set);
	}
}
