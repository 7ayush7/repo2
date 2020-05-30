package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Create List from Array
public class Program6 {

	public static void main(String[] args) {
		
		Integer[] array=new Integer[] {1,2,3};
		List<Integer> list = Arrays.asList(array);
		List<Integer> list2= new ArrayList<>();
		Collections.addAll(list2, array);
		System.out.println(list);
		System.out.println(list2);
		
	}
	
}
