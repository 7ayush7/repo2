package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Sorting the list alphabetically
public class Program30 {

	static List comparator(List<String> list) {
		List<String> s=list;
		String temp=list.get(0);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("Z");
		list.add("X");
		list.add("I");
		List<String> s=comparator(list);
		System.out.println(s);
	}
}
