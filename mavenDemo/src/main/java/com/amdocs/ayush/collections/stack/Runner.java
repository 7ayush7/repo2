package com.amdocs.ayush.collections.stack;

public class Runner {

	public static void main(String[] args) throws Exception{
		CustomStack stack = new CustomStack(2);
		stack.push(0);
		stack.push(1);
		//stack.push(2);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek(1));
		System.out.println(stack.size());
	}
}
