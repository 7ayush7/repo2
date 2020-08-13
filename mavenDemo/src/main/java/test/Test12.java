package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task :
 * 
 * print all permutation of a String
 * 
 * */
public class Test12 {

	public static void main(String[] args){
		String s = "123";
		char[] c = s.toCharArray();
		Map<List<String>,String> map = new HashMap<>();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				for(int k=j+1;k<c.length;k++){
					map.put(Arrays.asList(String.valueOf(c[i]),String.valueOf(c[j]),String.valueOf(c[k])), "");
				}
			}
		}
		System.out.println(map);
	}
}
