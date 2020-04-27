package com.amdocs.ayush.collections.stack;

public class CustomStack {

	int size;
	Integer[] customStack;
	int top=0;
	
	CustomStack(int size){
		customStack = new Integer[size];
	}
	public void push(int data) throws Exception{
		if(!isFull()){
		customStack[top] = data;
		top++;
		}
		else{
			throw new Exception("Stack is already full");
		}
	}
	
	public int pop() throws Exception{
		if(!isEmpty()){
		top--;
		int data = customStack[top];
		customStack[top]=0;
		return data;
		}
		else{
			throw new Exception("Stack is already empty");
		}
	}
	
	public boolean isEmpty(){
		if(top==0){
			return true;
		}
		else return false;
	}
	
	public boolean isFull(){
		if(top==size()){
			return true;
		}
		else {
			return false;
		}
	}
	public int peek(int index) throws Exception{
		checkForException(index);
		return customStack[index]; 
	}
	
	public void checkForException(int index) throws Exception{
		if(index>=size()){
			throw new Exception("Invalid index");
		}
	}
	public int size(){
		return customStack.length;
	}
	
}
