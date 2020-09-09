package test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Task :
 * 
 * How to print the duplicate characters from the given String
 */
public class Test8 {

	public static void main(String[] args) {
		String s = "JavaandJavascript";
		char[] c = s.toCharArray();
		Set<String> list = new LinkedHashSet<>();
		Set<String> dupList = new LinkedHashSet<>();
		for (int i = 0; i < c.length; i++) {
			if (!list.add(String.valueOf(c[i]))) {
				dupList.add(String.valueOf(c[i]));
			}
		}
		System.out.println(list);
		System.out.println(dupList);
	}
}