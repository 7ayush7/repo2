package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	DBFactory fact;
	
	@RequestMapping("/get/customer/{id}")
	@ResponseBody
	public Customer get(@PathVariable("id")int id) {
		Optional<Customer> optionalc = fact.findById(id);
		return optionalc.isPresent()?optionalc.get():new Customer();
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List getAll() {
		fact.findAll();
		return fact.findAll();
	}
}
