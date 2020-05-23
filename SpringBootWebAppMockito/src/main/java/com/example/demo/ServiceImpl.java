package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements com.example.demo.Service{

	@Autowired
	DBFactory factory;
	
	@Override
	public List getCustomers() {
		return factory.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return factory.getCustomerById(id);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return factory.getCustomerByName(name);
	}

	@Override
	public Customer saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		return factory.save(c);
	}

	@Override
	public Customer updateCustomer(Customer c){
		// TODO Auto-generated method stub
		Optional<Customer> optional = factory.findById(c.getId());
		
		if(optional.isPresent()) {
			return factory.save(c);
		}
		else {
			throw new CustomException("Cannot update Customer as Customer does not exist. Please create user first");
		}
	}

	@Override
	public void deleteCustomer(int id) {
		factory.deleteById(id);
	}

	@Override
	public void deleteAll() {
		factory.deleteAll();
	}
}
