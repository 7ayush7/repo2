package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enquiry")
public class Controller {
	
	List<Customer> list = new ArrayList<>();
	
	public List<Customer> createList() {
		this.list.addAll(Arrays.asList(new Customer("test1", -1),new Customer("test2", 22)));
		return this.list;
	}
	
	@GetMapping("/customer/all")
	public List getAll() {
		createList();
		List<Customer> retList = new ArrayList<>();
		for(Customer c : this.list) {
			Link l2 = WebMvcLinkBuilder.linkTo(Controller.class).slash("customer").
					slash(c.getName()).withSelfRel().withTitle("Customer Details");
			c.add(l2);
			retList.add(c);
		}
		return retList;
	}
	
	@GetMapping("/customer/{name}")
	public Customer getCustomerDetail(@PathVariable("name") String name) {
		for(Customer c : this.list) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}
	}
