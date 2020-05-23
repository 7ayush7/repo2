package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DBFactory extends JpaRepository<Customer, Integer>{

	@Query(value = "from Customer where name = ?1")
	Customer getCustomerByName(String name);
	
	@Query(value = "from Customer where id = ?1")
	Customer getCustomerById(int id);
}
