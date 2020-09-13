package java8.ayush.assignment10;

public class Address {
	String zipcode;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode +"]";
	}

	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}
	
}
