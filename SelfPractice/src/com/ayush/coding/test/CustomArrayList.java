package com.ayush.coding.test;

import java.util.Arrays;

class AList{
	Object[] arr = new Object[2];
	static int counter=0;
	
	public void add(Object obj){
		if(counter>=arr.length){
			arr = Arrays.copyOf(arr, arr.length*2);
		}
			arr[counter]=obj;
			counter++;	
	}
	
	public String toString(){
		String ret = "";
		for(int i=0;i<counter;i++){
			ret=ret.concat(" ").concat(String.valueOf(arr[i]));
		}
		return ret;
	}
	
	public void remove(int index){
		for(int i=index;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		counter--;
	}
}
public class CustomArrayList {

	public static void main(String[] args){
		AList list = new AList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list.toString());
		list.remove(4);
		list.remove(4);
		System.out.println(list.toString());
	}
}
