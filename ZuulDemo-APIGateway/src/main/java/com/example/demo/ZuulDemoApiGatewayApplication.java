package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulDemoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoApiGatewayApplication.class, args);
	}

}
