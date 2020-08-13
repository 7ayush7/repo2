package com.ayush.coding.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class LocalEmp implements Comparable<LocalEmp>{

	int id;
	String name;
	
	public LocalEmp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(LocalEmp o) {
		return this.id>o.id?1:-1;
	}
	public String toString(){
		return this.id+" "+this.name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		LocalEmp other = (LocalEmp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class SortListUsingComparable {

	public static void main(String[] args){
		Map<LocalEmp, Integer> map = new TreeMap<LocalEmp, Integer>();
		map.put(new LocalEmp(3, "A"), 3);
		map.put(new LocalEmp(2, "A"), 3);
		map.put(new LocalEmp(2, "A"), 3);
		System.out.println(map);
		/*VImp : Unlike Hashmap and LinkedHashMap .. TreeMap does not uses hashCode() and equals() method for key comparison rather TreeMap
		internally uses comparable methods for comparison part... though we can override equals and hashcode
		for comparing values.
		Refer : https://stackoverflow.com/questions/32841424/equals-and-hashcode-in-java-linkedhashmap-and-tree-map
		*/
		
		Map<LocalEmp, Integer> map2 = new HashMap<LocalEmp, Integer>();
		map2.put(new LocalEmp(3, "A"), 3);
		map2.put(new LocalEmp(2, "A"), 3);
		map2.put(new LocalEmp(2, "A"), 3);
		System.out.println(map2);
	}
}
