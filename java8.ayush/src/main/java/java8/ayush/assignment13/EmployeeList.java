package java8.ayush.assignment13;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	List<Employee> emplList;
	
	public EmployeeList() {
		// TODO Auto-generated constructor stub
	emplList = new ArrayList<Employee>();
	for(int i=1;i<10;i++) {
		emplList.add(new Employee(i, "A"+i));
	}
	}

	public List<Employee> getEmplList() {
		return emplList;
	}

	public void setEmplList(List<Employee> emplList) {
		this.emplList = emplList;
	}

	@Override
	public String toString() {
		return "EmployeeList [emplList=" + emplList + "]";
	}
	
}
