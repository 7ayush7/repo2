package java8.ayush.assignment9;

public class Employee {

	int id;
	int age;
	String name;
	String sex;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(int id, int age, String name, String sex){
		this.id=id;
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee : "+this.id+" "+this.age+" "+this.name+" "+this.sex;
	}
}
