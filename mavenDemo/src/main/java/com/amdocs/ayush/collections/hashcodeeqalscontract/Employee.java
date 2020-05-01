package com.amdocs.ayush.collections.hashcodeeqalscontract;

public class Employee {

	int id;
	String name;
	Employee(){}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
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
		if(id==other.id){
			return true;
		}
		return false;
	}
	
}
