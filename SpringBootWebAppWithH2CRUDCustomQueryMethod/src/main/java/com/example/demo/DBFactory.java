package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DBFactory extends CrudRepository<Customer, Integer>{

	//Spring Data JPA is intelligent enough to create logic to find data by entities of any table
	List<Customer> findByName(String name);

	//creating a custom method
	@Query("from Customer where name=?1 order by country asc")
	List<Customer> findByNameSortedByCountry(String name);
}
