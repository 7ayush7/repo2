package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Sort a collection without using Collection.sort
public class Program28 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("D");
		list.add("Z");
		list.add("E");
		list.add("B");
		
		String small=list.get(0);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					small=list.get(i);
					list.set(i, list.get(j));
					list.set(j, small);
				}
			}
		}
		System.out.println(list);
	}
}
