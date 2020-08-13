package test;

import java.util.LinkedList;
import java.util.List;

/**
 * Task : 
 * 
 * How to remove all duplicates from a given string
 * 
 * */
public class Test7 {

	public static void main(String[] args){
		String s="qwqwqwqwqwqwqwqayuusjjjks";
		char[] repStr=s.toCharArray();
		StringBuilder ret = new StringBuilder();
		List<Character> list = new LinkedList<>();
		for(int i=0;i<repStr.length;i++){
			if(!list.contains(repStr[i])){
				list.add(repStr[i]);
			}
		}
		for(Character c:list){
		ret.append(String.valueOf(c));
		}
		System.out.println(ret.toString());
	}
}
