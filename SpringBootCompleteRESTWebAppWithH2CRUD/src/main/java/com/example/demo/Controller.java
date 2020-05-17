package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;

import net.minidev.json.JSONObject;

@RestController
public class Controller {

	@Autowired
	DBFactory factory;
	
	//Get method to retrieve one object by id
	@GetMapping("customer/{id}")
	public Customer getCustomerDetail(@PathVariable("id") int id) {
		Optional<Customer> c = factory.findById(id);
		return c.isPresent()?c.get():new Customer();
	}
	
	//Get method to retrieve all customer objects 
	@GetMapping("customers")
	public List getCustomers() {
		return factory.findAll();
	}
	
	//Save Customer Data
	@PostMapping("customer")
	public Customer saveCustomerData(@RequestBody Customer c) {
		return factory.save(c);
	}
	
	//Update Customer Data
	@PutMapping("customer")
	public Customer updateCustomerData(@RequestBody Customer c) {
		return factory.save(c);
	}
	
	//Delete Customer Data by id
	@DeleteMapping("customer/{id}")
	public Object deleteCustomerById(@PathVariable("id") int c) {
		factory.deleteById(c);
		JSONObject json = new JSONObject();
		json.appendField("id", c);
		json.appendField("message", "Customer is deleted");
		return json;
	}
	
	//Delete all Customer Data
	@DeleteMapping("customers")
	public Object deleteAllCustomers() {
		factory.deleteAll();
		JSONObject json = new JSONObject();
		json.appendField("message", "All customers are deleted");
		return json;		
	
	}
}
