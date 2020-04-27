package com.amdocs.ayush.collections.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable{
	int id;
	String name;
	
	Student(){}
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
}
public class ArrayListSerializableExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Ayush"));
		list.add(new Student(2, "Animesh"));
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
		out.writeObject(list);//To Serialize ArrayList of Student object Student class must also be serialized
		out.close();
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("test.txt"));
		ArrayList list2=(ArrayList) oin.readObject();
		System.out.println(list2);
		
	}
}
