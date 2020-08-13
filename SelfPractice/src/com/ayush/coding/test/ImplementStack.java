package com.ayush.coding.test;

class CustomStack{
	int top=0;
	Object[] stack;
	public CustomStack(int size) {
		 stack = new Object[size];
	}
	
	void push(int data){
		stack[top]=data;
		top++;
	}
	
	void pop(){
		top--;
		stack[top]=0;
	}
	Object peek(){
		return stack[--top];
	}
	
	public String toString(){
		StringBuilder b = new StringBuilder();
		for(int i=0;i<top;i++){
			b.append(stack[i]+" : ");
		}
		return b.replace(b.lastIndexOf(":"), b.lastIndexOf(":")+1, "").toString();
	}
	
}
public class ImplementStack {
	public static void main(String[] args){
		CustomStack stack = new CustomStack(10);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.toString());
		stack.pop();
		stack.pop();
		System.out.println(stack.toString());
		System.out.println(stack.peek());
	}
}
