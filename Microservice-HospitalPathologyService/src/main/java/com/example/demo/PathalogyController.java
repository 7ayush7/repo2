package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital/pathalogy")
public class PathalogyController {

	@Autowired
	DBFactory factory;
	
	@GetMapping("/test/{id}")
	public PathalogyTest getPathalogyTestById(@PathVariable("id") int id) {
		Optional<PathalogyTest> p = factory.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		else {
			throw new PathalogyCustomRuntimeException("No test found for this id");
		}
	}
	
	@GetMapping("/tests")
	public PathalogyTestList getPathalogyTests() {
		PathalogyTestList list = new PathalogyTestList();
		list.setList(factory.findAll());
		return list;
	}
	
	@PostMapping("/test")
	public PathalogyTest savePathalogyTest(@RequestBody PathalogyTest p) {
		return factory.save(p);
	}
	
	@PutMapping("/test")
	public PathalogyTest updatePathalogyTest(@RequestBody PathalogyTest p) {
		return factory.save(p);
	}
}
