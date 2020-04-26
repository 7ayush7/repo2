package com.amdocs.ayush.objectclone;

public class ClassB implements Cloneable{

	String data;
	ClassA classA;
	
	ClassB(){}
	ClassB(String data, ClassA classA){
		this.data=data;
		this.classA=classA;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ClassA getClassA() {
		return classA;
	}
	public void setClassA(ClassA classA) {
		this.classA = classA;
	}
	protected Object clone() throws CloneNotSupportedException{
		ClassB c = (ClassB)super.clone();
		c.classA = (ClassA) classA.clone();
		return c;
	}
	public String toString(){
		return this.data+" "+this.classA;
	}
}
