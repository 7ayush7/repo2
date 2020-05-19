package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital/nursing")
public class NursingController {

	@Autowired
	DBfactory factory;
	
	@GetMapping("/totalpatients")
	public int getTotalPatients() {
		return factory.countPatient();
	}
	
	@GetMapping("/patients")
	public NursingList getPatients() {
		NursingList list = new NursingList();
		list.setList(factory.findAll());
		return list;
	}
	
	@GetMapping("/patient/{patientId}")
	public Nursing getPatient(@PathVariable("patientId") int id) {
		Optional<Nursing> optional = factory.findById(id);
		return optional.isPresent()?optional.get():new Nursing();
	}
	
	@PostMapping("/patient")
	public Nursing savePatient(@RequestBody Nursing s) {
		return factory.save(s);
	}
}
