package com.learning.ayush.miscellaneous;

//An example to understand try within try block implementation
//The crux is :
//The exception will keep looking for the catch/Exception handling
//if it gets the catch in inside block. The block will end with finally block execution.
//otherwise it will jump over to the parent catch block
public class NestedTryDemo {
	public static void main(String[] args) {
		try {
			System.out.println("In Outer try block");
			try {
				System.out.println("In Inner try block");
				int a = 7 / 0;
			} catch (IllegalArgumentException e) {
				System.out.println("IllegalArgumentException caught");
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException caught");
			} finally {
				System.out.println("In Inner finally");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught2");
		} finally {
			System.out.println("In Outer finally");
		}
	}
}