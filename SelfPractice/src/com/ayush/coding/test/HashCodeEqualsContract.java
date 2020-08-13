package com.ayush.coding.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class LocStudent{
	int id;
	String name;
	
	public LocStudent(int id,String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocStudent other = (LocStudent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name;
	}
	
}
public class HashCodeEqualsContract {

	public static void main(String[] args){
		Set<LocStudent> set = new LinkedHashSet<>(Arrays.asList(new LocStudent(1, "a"),
				new LocStudent(2, "b"),new LocStudent(3, "a"),new LocStudent(4, "a")));
		System.out.println(set);
		Map<LocStudent, Integer> map = new LinkedHashMap<>();
		map.put(new LocStudent(1, "a"), 1);
		map.put(new LocStudent(2, "b"), 2);
		map.put(new LocStudent(3, "a"), 3);
		map.put(new LocStudent(4, "a"), 4);
		System.out.println(map);
	}
}
