package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Remove duplicates from a list
public class Program31 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		
		List<String> dummyList = new ArrayList<>();
		for(String i:list) {
			if(!dummyList.contains(i)) {
				dummyList.add(i);
			}
		}
		System.out.println(dummyList);
	}
}
