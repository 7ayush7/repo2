package com.learning.ayush.collections.designpattern.creationaldesignpattern;

class Vehicle {

	// mandatory fields
	private String name;
	private String engine;
	private int wheels;

	// optional fields
	private int airbags;

	private Vehicle(VehicleBuilder builder) {
		this.name = builder.name;
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.airbags = builder.airbags;
	}

	public String toString() {
		return this.name + " " + this.engine + " " + this.wheels + " " + this.airbags;
	}

	static class VehicleBuilder {

		private String name;
		private String engine;
		private int wheels;
		private int airbags;

		public VehicleBuilder(String name, String engine, int wheels) {
			this.name = name;
			this.engine = engine;
			this.wheels = wheels;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}

public class BuilderDesignPatternExample {

	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("Car", "1000CC", 4).setAirbags(4).build();
		System.out.println(car);
		Vehicle bike = new Vehicle.VehicleBuilder("Bike", "250CC", 2).build();
		System.out.println(bike);
	}
}
