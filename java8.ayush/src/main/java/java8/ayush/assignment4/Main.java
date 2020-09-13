package java8.ayush.assignment4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ayush.singh
 * 
 * JDK 8 : Assignment 4 – Using Reducing in Parallel
1.      Create an array 10,000 Employee Object with 3 attributes as Id, Name, Salary and Department Id
2.      10,000 employees are divided into 4 departments
3.      Need to compute the sum of salaries for each department and create a map with key as department id & value as max salary
 * */
public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		long salary = 0;
		int depId = 1;
		for (int i = 1; i < 100; i++) {
			salary = salary + 10;
			depId = i <= 25 && i > 0 ? 1 : i <= 50 && i > 25 ? 2 : i <= 75 && i > 50 ? 3 : 4;
			list.add(new Employee(i, "A" + i, salary, depId));
		}
		System.out.println(list);
		System.out.println(calculateSumOfSalaryOfEacDepartment(list));
	}

	private static Map<Integer,Long> calculateSumOfSalaryOfEacDepartment(List<Employee> list) {
		// TODO Auto-generated method stub
		Map<Integer, Long> map = new LinkedHashMap<Integer, Long>();
		long salary=0;
		for(Employee e:list) {
			if(map.containsKey(e.getDepId())) {
				salary=salary+e.getSalary();
			}
			else {
				salary=e.getSalary();
			}
			map.put(e.getDepId(), salary);
			System.out.println(e.getDepId()+" "+salary);
		}
		return map;
	}
}
