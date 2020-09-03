package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repository extends JpaRepository<Mobile, Integer>{

	@Query("Select count(1) from Mobile")
	int mobileTotalCount();

}
