package com.amdocs.ayush.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumber1To100 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;
			for (int div = 2; div <= num; div++) {
				if (num % div == 0 && div != num) {
					isPrime = false;
				}
			}
			if(isPrime){
				list.add(num);
			}
		}
		System.out.println(list);
	}
}
