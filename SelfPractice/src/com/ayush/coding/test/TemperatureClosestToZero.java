package com.ayush.coding.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperatureClosestToZero {

	public static void main(String[] args){
		Integer[] arr = {1,2,-3,-3,-22,-1,22,5,6,7,-2};
		List<Integer> listSmallerThanZero = new ArrayList<>();
		List<Integer> listGreaterThanZero = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=0){
				listSmallerThanZero.add(arr[i]);
			}
			else{
				listGreaterThanZero.add(arr[i]);
			}
		}
		Collections.sort(listSmallerThanZero);
		Collections.sort(listGreaterThanZero);
		System.out.println("Temp Closest to zero : "+ listGreaterThanZero.get(0)
		+" and "+ listSmallerThanZero.get(listSmallerThanZero.size()-1));
	}
}
