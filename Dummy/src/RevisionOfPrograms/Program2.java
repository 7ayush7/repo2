package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find duplicates in an array/List
public class Program2 {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[] {1,2,2,3,4,5,5,5,5,6};
		List<Integer> list = Arrays.asList(array);
		List<Integer> dupList = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(!dupList.contains(list.get(i))) {
				dupList.add(list.get(i));
			}
		}
		System.out.println(dupList);
	}	
}
