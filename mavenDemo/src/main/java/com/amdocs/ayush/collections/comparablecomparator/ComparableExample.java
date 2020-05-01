package com.amdocs.ayush.collections.comparablecomparator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{

	int id;
	String name;
	
	Employee (){}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return this.id+" "+this.name;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id>o.id?1:this.id<o.id?-1:0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (id == other.id) {
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	
}
public class ComparableExample {

	public static void main(String[] args){
	Employee e1 = new Employee(1, "Ayush");
	Employee e2 = new Employee(99, "test1");
	Employee e3 = new Employee(2, "test2");
	Employee e4 = new Employee(0, "test3");
	Employee e5 = new Employee(0, "test4");


	List<Employee> list = new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);

	//Collections.sort(list);
	TreeSet<Employee> set = new TreeSet<>(list);
	System.out.println(list);
	System.out.println(set);
	
	TreeMap<Employee,Integer> map = new TreeMap<>();
	map.put(e4, 1);
	map.put(e5, 2);
	map.put(e3, 3);
	map.put(e2, 4);
	map.put(e1, 5);

	
	System.out.println(map);
	}
}
