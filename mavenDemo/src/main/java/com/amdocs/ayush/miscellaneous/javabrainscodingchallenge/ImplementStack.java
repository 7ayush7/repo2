package com.amdocs.ayush.miscellaneous.javabrainscodingchallenge;

class CustomStack{
	int[] t;
	int size;
	int top=0;
	
	CustomStack(int size){
		t = new int[size];
	}
	
	public int push(int data){
		t[top] = data;
		top++;
		return t[top];
	}
	
	public void pop(){
		t[top] = 0;
		top--;
	}
	
	public int size(){
		return top;
	}
	
	public void printStack(){
		for(int i=0;i<top;i++){
			System.out.println(t[i]);
		}
	}
}
public class ImplementStack {

	public static void main(String[] args){
		CustomStack stack = new CustomStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.printStack();
		stack.pop();
		System.out.println();
		stack.printStack();
	}
}
