package com.ayush.coding.test;

public class Swap2NumbersWithAndWithoutUsingTempVariable {

	public static void main(String[] arg){
		int i1 = 10;
		int i2 = 11;
		
		i1 = i1+i2;
		i2 = i1-i2;
		i1 = i1-i2;
		
		System.out.println(i1);
		System.out.println(i2);
	}
}
