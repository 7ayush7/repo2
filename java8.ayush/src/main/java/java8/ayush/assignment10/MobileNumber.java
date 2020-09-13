package java8.ayush.assignment10;

public class MobileNumber {
	String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MobileNumber [number=" + number + "]";
	}

	public MobileNumber(String number) {
		super();
		this.number = number;
	}
	
	
}
