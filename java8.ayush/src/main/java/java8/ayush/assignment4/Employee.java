package java8.ayush.assignment4;

public class Employee {

	int id;
	String name;
	long salary;
	int depId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(int id, String name, long salary, int depId){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.depId=depId;
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
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee : "+this.id+" "+this.name+" "+this.salary+" "+this.depId;
	}
}
