package RevisionOfPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Copy all elements of HashSet in an array and elements of array in set
public class Program29 {

	public static void main(String[] args) {
		Set<Integer> set= new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		Integer[] in = new Integer[set.size()];
		in = set.toArray(in);
		
		for(int i:in) {
			System.out.println(i);
		}
		
		Set<Integer> set2 = new HashSet<>();
		Collections.addAll(set2, in);
		System.out.print(set2);
		
		
	}
}
