package com.learning.ayush.collections.designpattern.creationaldesignpattern;

interface Vehicle1 {
	void getVehicleName();
}

class Car implements Vehicle1 {

	String name;

	Car(String name) {
		this.name = name;
	}

	@Override
	public void getVehicleName() {
		System.out.println("Car : " + this.name);
	}
}

class Bike implements Vehicle1 {

	String name;

	Bike(String name) {
		this.name = name;
	}

	@Override
	public void getVehicleName() {
		System.out.println("Bike :" + this.name);
	}

}

class Factory {

	public static Vehicle1 getInstance(String type, String name) {
		if (type.equals("car")) {
			return new Car(name);
		} else if (type.equals("bike")) {
			return new Bike(name);
		}
		return null;
	}
}

public class FactoryDesignPatternExample {

	public static void main(String ars[]) {
		Vehicle1 v = Factory.getInstance("car", "Wagonr");
		v.getVehicleName();

		Vehicle1 v2 = Factory.getInstance("bike", "Passion+");
		v2.getVehicleName();
	}
}
