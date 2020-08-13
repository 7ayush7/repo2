package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Task :
 * 
 * java program to find duplicate elements in an character array
 * 
 */
public class Test3 {

	public static void main(String[] args) {

		String s = "ayushman kumar singhania";
		char c[] = s.toCharArray();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (!list.contains(String.valueOf(c[j]))) {
					list.add(String.valueOf(c[j]));
				}
			}
		}
		System.out.println(list);

	}
}
