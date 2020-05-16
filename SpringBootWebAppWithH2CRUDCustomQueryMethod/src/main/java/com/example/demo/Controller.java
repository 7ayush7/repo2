package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	DBFactory factory;
	
	@RequestMapping("/")
	public ModelAndView welocme() {
		ModelAndView mv = new ModelAndView("welcome.jsp");
		return mv;
	}

	@RequestMapping("/save")
	@ResponseBody
	public Customer save(Customer cus) {
		Customer c = factory.save(cus);
		return c;
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public List get(int id,String name,String country) {
		
//		Optional<Customer> c = factory.findById(id);
//		List<Customer> list = new ArrayList<>();
//		list.add(c.isPresent()?c.get():new Customer());
//		return list;
		
		//Requirement : Create a method that returns Customer object findByName
		System.out.println(factory.findByNameSortedByCountry(name));
		return factory.findByNameSortedByCountry(name);
	}
}
