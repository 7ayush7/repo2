package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	private String country;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
