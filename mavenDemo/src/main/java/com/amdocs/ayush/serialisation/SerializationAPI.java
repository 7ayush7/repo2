package com.amdocs.ayush.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import test.Test;

class Student implements Serializable{

	//private static final long serialVersionUID = 5991770555536253902L;
	/**
	 * 
	 */
	//SerialVersionUID is important, this version id must be generated once the changes for your class is done completetly
	//now as the UID is generated, once you serialize your object, it gets converted to stream. Now while doing 
	//deserialization, this ID is matched with the object it is getting derialized to and if the data is incorrect
	//that means that the object has changed, hence this UID is used to maintain consistency across the system.
	//As serialization and deserialization is platform independent hence it is important that the Serializable object 
	//remains same during this process.
	
	//Always remember that JVM checks for this UID while doing deserialization and it must always be same and 
	//if there is any change in object then it will correspondingly lead to change in this ID.
	transient Integer id;// adding transient stops this field from being serialized
	String name;
	static Integer staticData;
	transient Test test;
	
	public Student(){
		
	}
	public Student(Integer id, String name,Integer staticData,Test test) {
		super();
		this.id = id;
		this.name = name;
		this.test=test;
		this.staticData = staticData;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return this.id+" "+this.name+" "+this.staticData+" "+this.test;
	}
	
}
public class SerializationAPI {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//Serialization is -> Conversion of Java Object to Stream
		//Deserialization is -> Conversion of Stream to Java Object
		
		//In serialization -> we use OutputStream to writeObject
		//In deserialization -> we use InputStream to readObject
		
		//Serialization

		Student s = new Student(1, "Ayush",1,new Test(10));
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
		out.writeObject(s);
		out.close();
		s.staticData = 100;// See the data is changed for static data, when it is changed after serialization
		//Deserialization
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
		Student s2 = (Student) in.readObject();
		System.out.println(s2);
		in.close();  
	}
}
