package com.ayush.coding.test;

import java.util.Scanner;
import java.util.Stack;

public class WellFormed_BalancedString {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='<'||s.charAt(i)=='('){
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)=='>'||s.charAt(i)==')'){
				stack.pop();
			}
		}
		boolean flag = stack.size()==0?true:false;
		System.out.println("Is Well Formed "+flag);
	}
}
