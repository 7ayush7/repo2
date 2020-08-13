package com.ayush.coding.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LocalStud{
	int id;
	String name;
	
	public LocalStud(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return this.id+" "+this.name;
	}
}
public class SortListUsingComparator {

	public static void main(String[] arfs){
		List<LocalStud> list = new LinkedList<LocalStud>(Arrays.asList(new LocalStud(1, "A"),
				new LocalStud(4, "A"),new LocalStud(2, "A"),new LocalStud(2, "AA")));
		list.sort((a,b)->{
			return a.id>b.id?1:a.id<b.id?-1:a.name.compareTo(b.name);
		});
		System.out.println(list);
	}
}
