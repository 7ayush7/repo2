package com.amdocs.ayush.objectclone;

public class ClassA implements Cloneable{

	int id;
	String name;
	
	ClassA(){}
	ClassA(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString(){
		return this.id+" "+this.name;
	}
}
