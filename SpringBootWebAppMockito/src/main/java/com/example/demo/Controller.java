package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Controller {

	@Autowired
	Service service;
	
	@GetMapping("/users")
	List getCustomers() {
		return service.getCustomers();
	}
	
	@GetMapping("/user/{id}")
	Customer getCustomerById(@PathVariable("id") int id) {
		return service.getCustomerById(id);
	}
	
	@GetMapping("/user/{name}")
	Customer getCustomerByName(String name) {
		return service.getCustomerByName(name);
	}

	@PostMapping("/user")
	Customer saveCustomer(@RequestBody Customer c) {
		return service.saveCustomer(c);
	}

	@DeleteMapping("/user/{id}")
	void deleteCustomer(int id) {
		service.deleteCustomer(id);
	}
	
	@DeleteMapping("/users")
	void deleteAll() {
		service.deleteAll();
	}
	
	@PutMapping("/users")
	Customer updateCustomer(@RequestBody Customer c) {
		return service.updateCustomer(c);
	}

}
