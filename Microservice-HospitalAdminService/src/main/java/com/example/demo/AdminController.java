package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/hospital/admin")
public class AdminController {

	Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	DBFactory factory;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/testsavailable")
	@HystrixCommand(fallbackMethod = "fallback")
	public Object getAllPathalogyTests() {
		PathalogyTestList list = restTemplate.getForObject("http://PATHALOGY-SERVICE/hospital/pathalogy/tests", PathalogyTestList.class);
		return list;
	}
	
	public Object fallback() {
		JSONObject obj = new JSONObject();
		obj.appendField("error", "failed to call the microservice");
		obj.appendField("reason", "unable to access the service");
		return obj;
	}
	
	@GetMapping("/listofpatients")
	public NursingList getAllPatients() {
		NursingList list = restTemplate.getForObject("http://NURSING-SERVICE/hospital/nursing/patients", NursingList.class);
		return list;
	}
	
	@GetMapping("/patientcount")
	public Integer getPatientCount() {
		Integer i = restTemplate.getForObject("http://NURSING-SERVICE/hospital/nursing/totalpatients", Integer.class);
		return i;
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentDetails(@PathVariable("id") String id) {
		Optional<Department> dep = factory.findById(id);
		logger.info("returning department details : "+dep);
		if(dep.isPresent()) {
			return dep.get();
		}
		else {
			throw new AdminCustomRuntimeException("there is no department in database for requested reference id");
		}
	}
	
	@GetMapping("/departments")
	public List getDepartments() {
		List<Department> list = factory.findAll();
		logger.info("returning department list details : "+list);
		return list;
	}
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department dep) {
		return factory.save(dep);
	}
	
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department dep) {
		return factory.save(dep);
	}
	
}
