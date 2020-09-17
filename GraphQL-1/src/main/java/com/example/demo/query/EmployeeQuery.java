package com.example.demo.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.dao.entity.Employee;
import com.example.demo.service.EmployeeService;

@Component
public class EmployeeQuery implements GraphQLQueryResolver{

	@Autowired
	public EmployeeService service;
	
	public Employee getEmployeeDetails(int id){
		return service.getEmployeeDetails(id);
	}
	
	public List<Employee> getListOfEmployees(){
		return service.getListOfEmployees();
	}
	
	public int getCountOfEmployees() {
		return service.getCountOfEmployees();
	}
	
}
