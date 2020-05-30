package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Every thing about Arrays and Collections
public class Program56 {

	public static void main(String[] args) {
		
		Set<Student1> set = new HashSet<>();
		set.add(new Student1(1,"A"));
		set.add(new Student1(1,"A"));
		set.add(new Student1(99,"B"));
		set.add(new Student1(9,"D"));
		set.add(new Student1(2,"C"));
		set.add(new Student1(98,"B"));
		
		List<Student1> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);		
		//list.forEach(a->System.out.println(a.id));
		
		System.out.println();
		Set<Student1> sortedSet = new TreeSet<>(Collections.reverseOrder());
		sortedSet.addAll(set);
		//sortedSet.forEach(a->System.out.println(a.id));

		Map<Integer,Student1> map = new HashMap<>();
		map.put(1, new Student1(1,"A"));
		map.put(3, new Student1(3,"A"));
		map.put(5, new Student1(5,"A"));
		map.put(2, new Student1(2,"A"));
		map.put(4, new Student1(4,"A"));
		
		Map<Integer,Student1> sortedMap = new TreeMap<>(Collections.reverseOrder());
		sortedMap.putAll(map);	
		sortedMap.forEach((a,b)->System.out.println(b.id));	
		
		Set<Student2> set2 = new HashSet<>();
		set2.add(new Student2(1,"A"));
		set2.add(new Student2(1,"A"));
		set2.add(new Student2(99,"B"));
		set2.add(new Student2(9,"D"));
		set2.add(new Student2(2,"C"));
		set2.add(new Student2(98,"B"));
		
		Set<Student2> sortedSet2 = new TreeSet<>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				return o1.id>o2.id?1:o1.id<o2.id?-1:0;
			}
		});
		sortedSet2.addAll(set2);
		System.out.println();
		sortedSet2.forEach(a->System.out.println(a.id));
	}
	
	
}

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	
	Student1(){}
	
	Student1(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Student1 o) {
		return this.id>o.id?1:this.id<o.id?-1:0;
	}
}

class Student2 {
	int id;
	String name;
	
	Student2(){}
	
	Student2(int id, String name){
		this.id=id;
		this.name=name;
	}
}