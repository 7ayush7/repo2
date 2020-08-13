package Revision2;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args){
		int[] arr = {1,2,3,4,4,5,6,5,0,0};
		Arrays.sort(arr);
		System.out.println(arr.length);
		int n=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				n++;
			}
		}
		int[] arr2 = new int[n];
		n=1;
		arr2[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				arr2[n++]=arr[i];
			}
		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}
