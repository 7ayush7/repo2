package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	DBFactory factory;
	
	@RequestMapping("/home")
	public ModelAndView welocme() {
		ModelAndView mv = new ModelAndView("welcome.jsp");
		return mv;
	}

	@RequestMapping("/save")
	@ResponseBody
	public Customer save(Customer cus) {
		ModelAndView mv = new ModelAndView("main.jsp");
		Customer c = factory.save(cus);
		mv.addObject(c);
		return c;
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public Customer get(int id) {
		ModelAndView mv = new ModelAndView("main.jsp");
		Optional<Customer> c = factory.findById(id);
		mv.addObject(c.isPresent()?c.get():new Customer());
		return c.isPresent()?c.get():new Customer();
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Customer update(Customer c) {
		ModelAndView mv = new ModelAndView("main.jsp");
		factory.deleteById(c.getId());
		Customer retC = factory.save(c);
		mv.addObject(retC);
		return retC;
	}
	
	@RequestMapping("/delete")
	public void delete(Customer c) {
		factory.delete(c);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		Iterable<Customer> list = factory.findAll();
		StringBuilder s = new StringBuilder();
		ModelAndView mv = new ModelAndView("main.jsp");
		for(Customer i:list) {
			s.append(i.getId()+" "+i.getName());
			s.append("//");
		}
		return s.toString();
	}
	
	@RequestMapping("/deleteAll")
	public void deleteAll() {
		factory.deleteAll();
	}
}
