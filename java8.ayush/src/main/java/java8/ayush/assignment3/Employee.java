package java8.ayush.assignment3;

public class Employee {

	int id;
	String name;
	long salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, long salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee : "+this.id+" "+this.name+" "+this.salary;
	}
}
