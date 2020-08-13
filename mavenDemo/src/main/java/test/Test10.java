package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Task :
 * 
 * How to remove characters from the first String which are present in the second String
 * 
 * Str1 : This is india 
 * Str2 : in
 * 
 * Ret Str : Ths s nda
 * */
public class Test10 {

	public static void main(String[] args){
		String s1 = "this is India";
		String s2 = "in";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		StringBuilder s = new StringBuilder();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<c1.length;i++){
			list.add(String.valueOf(c1[i]));
			for(int j=0;j<c2.length;j++){
				if(c1[i]==c2[j]){
					list.remove(String.valueOf(c1[i]));
				}
			}
		}
		System.out.println(list);
		for(String s3:list){
			s.append(s3);
		}
		System.out.println(s.toString());
	}
}
