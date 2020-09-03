package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Controller {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("accountTotalCount")
	@HystrixCommand(fallbackMethod = "accountTotalCountFallback")
	public int accountTotalCount() {
		return restTemplate.getForObject("http://account/count", Integer.class);
	}
	
	public int accountTotalCountFallback() {
		return 0;
	}
	
	@GetMapping("mobileTotalCount")
	@HystrixCommand(fallbackMethod = "mobileTotalCountFallback")
	public int mobileTotalCount() {
		return restTemplate.getForObject("http://mobile/count", Integer.class);
	}
	

	public int mobileTotalCountFallback() {
		return 0;
	}
}
