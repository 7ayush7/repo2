package com.ayush.coding.test;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPallindromeSubstring {

	public static void main(String[] args){
		String s = new Scanner(System.in).nextLine();
		String[] arr = s.split(" ");
		Arrays.sort(arr, (a,b)->{
			return a.length()>b.length()?1:a.length()<b.length()?-1:0;
		});
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i].equals(new StringBuilder(arr[i]).reverse().toString())){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
