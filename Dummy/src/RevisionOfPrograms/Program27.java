package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Program to implement all kinds of collection
public class Program27 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		list.forEach(l->System.out.print(l));
		System.out.println();
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.forEach(s->System.out.print(s));
		System.out.println();
		
		Map<String,String> map=new HashMap<>();
		map.put("A", "A");
		map.put("B", "A");
		map.put("C", "A");
		map.put("D", "A");
		map.put("E", "A");
		map.forEach((a,b)->System.out.print(a));
		System.out.println();
	}
}
