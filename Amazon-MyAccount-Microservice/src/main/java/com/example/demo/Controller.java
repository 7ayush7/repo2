package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account acc) {
		return service.createAccount(acc);
	}
	
	@PutMapping("/update")
	public Account updateAccount(@RequestBody Account acc) {
		return service.updateAccount(acc);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAccount(@PathVariable("id") int id) {
		service.deleteAccount(id);
	}
	
	@GetMapping("/get/{id}")
	public Account getAccount(@PathVariable("id") int id) {
		return service.getAccount(id);
	}
	
	@GetMapping("/count")
	public int accounttotalCount() {
		return service.accountTotalCount();
	}
}