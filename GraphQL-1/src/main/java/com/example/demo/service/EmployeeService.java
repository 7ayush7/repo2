package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.Repo;

@Component
public class EmployeeService {

	@Autowired
	public Repo repo;
	
	public Employee getEmployeeDetails(int id){
		Optional<Employee> e = repo.findById(id);
		return e.isPresent()?e.get():new Employee();
	}
	
	public List<Employee> getListOfEmployees(){
		return repo.findAll();
	}
	
	public int getCountOfEmployees() {
		return repo.getCountOfEmployees();
	}
	
	public Employee createEmployee(int id, String name) {
		return repo.save(new Employee(id, name));
	}
	
	public Employee updateEmployee(int id, String name) throws Exception {
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent()) {
			Employee e2 = e.get();
			e2.setName(name);
			return repo.save(e2);
		}
		else {
			throw new Exception("Create Object first");
		}
	}
	
	public boolean deleteEmployee(int id) {
		repo.deleteById(id);
		return true;
	}
}