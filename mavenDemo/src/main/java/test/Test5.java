package test;

import java.util.Arrays;

/**
 * task :
 * 
 * Write a java program to find second largest element in an array of integers
 * */
public class Test5 {

	public static void main(String[] args){
		int[] input = {1,2,3,-23,4,0,23};
		Arrays.sort(input);
		System.out.println(input[input.length-2]);
	}
}
