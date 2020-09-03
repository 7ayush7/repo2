package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	@GetMapping("/mobiles")
	public List<Mobile> getListOfMobiles() {
		List<Mobile> list = service.getMobiles();
		List<Mobile> list2 = new ArrayList<Mobile>();
		for(Mobile m:list) {
			Link l = WebMvcLinkBuilder.linkTo(Controller.class).slash("mobile").withSelfRel();
			m.add(l);
			list2.add(m);
		}

		return list2;
	}
	
	@GetMapping("/mobile/{id}")
	public Mobile getMobileDetails(@PathVariable("id") int id) {
		return service.getMobileDetails(id);
	}
	
	@GetMapping("/count")
	public int mobileTotalCount() {
		return service.mobileTotalCount();
	}
}
