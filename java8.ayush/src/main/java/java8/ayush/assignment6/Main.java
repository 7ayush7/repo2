package java8.ayush.assignment6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ayush.singh
 * 
 * JDK 8 : Assignment 6 – Using lambda
 return a lambda expression performing a specified action:
•        PerformOperation isOdd(): The lambda expression must return true if a number is odd or false  if it is even.
•        PerformOperation isPrime(): The lambda expression must return true  if a number is prime or false  if it is composite.
•        PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or  false if it is not.
Input : list of integers
 * */

@FunctionalInterface
interface Check {
	public boolean condition(int num);
}

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<100;i++) {
			list.add(i);
		}
		Check c = (int num)->{
			return num%2!=0?Boolean.TRUE:Boolean.FALSE;
		};
		isOdd(list,c);
	}

	private static boolean isPallindrome(int num,Check c) {
		System.out.println(num+": Is Pallindrome : "+c.condition(num));
		return c.condition(num);
	}

	private static boolean isPrime(int c, Check check) {
		System.out.println(c+": Is Prime : "+check.condition(c));
		boolean t = check.condition(c)?Boolean.TRUE:isPallindrome(c,(int num)->{
			int backup = num;
			int sum = 0;
			int rem = 0;
			while(num>0) {
				rem = num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			return backup==sum?Boolean.TRUE:Boolean.FALSE;
		});
		return t;
	}

	private static void isOdd(List<Integer> list, Check c) {

		for(int i:list) {
			int val = i;
			System.out.println(i+": Is Odd : "+c.condition(i));
			boolean t = c.condition(i)?Boolean.TRUE:isPrime(i, (int num)->{
				boolean isPrime = true;
				if(num<2) {
					isPrime=false;
				}
				else {
					for(int j=2;j<num;j++) {
						if(num%j==0 && num!=j) {
							isPrime=false;
						}
					}
				}
				return isPrime;
			});
		}
	}
}
