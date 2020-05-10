package com.amdocs.ayush.miscellaneous;

import java.util.Scanner;

public class FindAllSubstringsInAString {

	public static void main(String[] args){
		System.out.println("Please enter the complete string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] parts = s.split("\\s");
		for(int i=0;i<parts.length;i++){
			System.out.println(parts[i]);
		}
		System.out.println("Size = "+parts.length);
	}
}
