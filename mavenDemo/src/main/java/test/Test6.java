package test;

import java.util.Map.Entry;
import java.util.*;

/**
 * Task :
 * 
 * How to find the 2nd maximum occurring character in given String
 * */
public class Test6 {

	public static void main(String[] args){
		String s = "aaaaasssdffffffff";
		Map<Character, Integer> map = new HashMap<>();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i], map.get(c[i])+1);
			}
			else{
				map.put(c[i],1);
			}
		}
		System.out.println(map);
		List<Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
		System.out.println(list.get(1));
	}
}
