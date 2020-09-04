package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Stack;

public class WellFormed_BalancedString {

	public static void main(String[] args) {
		String s = "[{{}}]<>()<(())><><>{}((({}))[])";
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		// char[] stack = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '[' || arr[i] == '{' || arr[i] == '<' || arr[i] == '(') {
				stack.push(arr[i]);
			} else if (arr[i] == ']') {
				if (stack.isEmpty()) {
					stack.push(arr[i]);
				} else if (stack.peek() == '[') {
					stack.pop();
				}
			} else if (arr[i] == '}') {
				if (stack.isEmpty()) {
					stack.push(arr[i]);
				} else if (stack.peek() == '{') {
					stack.pop();
				}
			} else if (arr[i] == ')') {
				if (stack.isEmpty()) {
					stack.push(arr[i]);
				} else if (stack.peek() == '(') {
					stack.pop();
				}
			} else if (arr[i] == '>') {
				if (stack.isEmpty()) {
					stack.push(arr[i]);
				} else if (stack.peek() == '<') {
					stack.pop();
				}
			}
		}
		System.out.println("Is Balanced String : " + (stack.size() == 0));

	}

}
