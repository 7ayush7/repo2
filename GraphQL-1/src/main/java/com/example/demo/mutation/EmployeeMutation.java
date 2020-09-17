package com.example.demo.mutation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.dao.entity.Employee;
import com.example.demo.service.EmployeeService;

@Component
public class EmployeeMutation implements GraphQLMutationResolver{

	@Autowired
	public EmployeeService service;


	public Employee createEmployee(int id, String name) {
		return service.createEmployee(id, name);
	}
	
	public Employee updateEmployee(int id, String name) throws Exception {
		return service.updateEmployee(id, name);
	}
	
	public boolean deleteEmployee(int id) {
		return service.deleteEmployee(id);
	}

}
