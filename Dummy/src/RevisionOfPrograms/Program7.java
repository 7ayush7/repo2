package RevisionOfPrograms;

import java.util.Arrays;
import java.util.List;

//Create Array from List
public class Program7 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,3);
		Integer[] array=new Integer[list.size()];
		array=list.toArray(array);
		for(int i:array) {
			System.out.println(i);
		}
		
	}
	
}
