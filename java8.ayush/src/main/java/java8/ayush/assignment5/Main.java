package java8.ayush.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ayush.singh
 * 
 * JDK 8 : Assignment 5 – Using map   
 * 
	Write a method that returns a comma-separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. 
	For example, if the input list is (3,44), the output should be 'o3,e44'.
 * */
public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		System.out.println(manipulateList(list));
	}

	private static String manipulateList(List<Integer> list) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();
		for(Integer i:list) {
			s.append(i%2==0?"e"+i:"o"+i);
			s.append(",");
		}
		s.replace(s.lastIndexOf(","), s.lastIndexOf(",")+1, "");
		return s.toString();
	}
}
