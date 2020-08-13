package test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Task :
 * 
 * How to print the duplicate words from the given String
 * 
 * */
public class Test9 {

	public static void main(String[] args){
		String s = "This is is is repeated set of words words repeated";
		String[] str = s.split(" ");
		Set<String> set = new LinkedHashSet<>();
		Set<String> dupSet = new LinkedHashSet<>();

		for(int i=0;i<str.length;i++){
			if(!set.contains(str[i])){
				set.add(str[i]);
			}
			else{
				dupSet.add(str[i]);
			}
		}
		System.out.println(set);
		System.out.println(dupSet);
	}
}
