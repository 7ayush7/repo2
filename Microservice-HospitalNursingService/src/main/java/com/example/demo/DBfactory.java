package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DBfactory extends JpaRepository<Nursing, Integer>{

	@Query("Select count(*) from Nursing")
	public int countPatient();
}
