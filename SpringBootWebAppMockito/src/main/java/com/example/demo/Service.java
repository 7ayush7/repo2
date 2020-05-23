package com.example.demo;

import java.util.List;

public interface Service {

	List getCustomers();
	Customer getCustomerById(int id);
	Customer getCustomerByName(String name);
	Customer saveCustomer(Customer c);
	void deleteCustomer(int id);
	void deleteAll();
	Customer updateCustomer(Customer c);
}
