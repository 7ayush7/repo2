package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//3rd maximum sum of 2 elements from a set
public class Program46 {

	public static void main(String[] args) {
		List<Integer> set=new ArrayList<>();
		set.add(1);
		set.add(-23);
		set.add(123);
		set.add(2);
		set.add(54);
		set.add(0);
		
		Collections.sort(set);
		int sum=0,first=set.get(0),secound=set.get(1);
		
		sum=set.get(5)+set.get(2);
		System.out.println(sum);

		
	}
}
