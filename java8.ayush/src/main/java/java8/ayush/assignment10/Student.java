package java8.ayush.assignment10;

import java.util.List;

public class Student {
	String name; int age; Address address; List<MobileNumber> mobileNumbers;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}


	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers=" + mobileNumbers
				 + "]";
	}


	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
	
	
}
