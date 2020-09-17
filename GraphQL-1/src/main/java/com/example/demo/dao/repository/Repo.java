package com.example.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.dao.entity.Employee;


@Component
public interface Repo extends JpaRepository<Employee, Integer>{

	@Query(value = "Select count(*) from Employee")
	Integer getCountOfEmployees();
}
