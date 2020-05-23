package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebAppMockitoApplicationTests {

	@Autowired
	Service service;
	
	@MockBean
	DBFactory factory;
	
	@Test
	public void getCustomers() {
		when(factory.findAll()).
		thenReturn(java.util.stream.Stream.of(new Customer(1, "test1"),new Customer(2, "test2")).collect(Collectors.toList()));
		assertEquals(2, service.getCustomers().size());
	}
	
	@Test
	public void getCustomerById() {
		Customer c = new Customer(7, "ayush");
		when(factory.getCustomerById(7)).
		thenReturn(null);
		assertEquals(c, service.getCustomerById(7));
	}

	@Test
	public void getCustomerByName() {
		Customer c = new Customer(7, "ayush");
		when(factory.getCustomerByName("ayush")).
		thenReturn(c);
		assertEquals(c, service.getCustomerByName("ayush"));
	}
	
	@Test
	public void save() {
		Customer c = new Customer(7, "ayush");
		when(factory.save(c)).
		thenReturn(c);
		assertEquals(c, service.saveCustomer(c));
	}
	
	@Test
	public void delete() {
		Customer c = new Customer(7, "ayush");
		service.deleteCustomer(7);
		verify(factory,times(1)).deleteById(7);
	}
	
	@Test
	public void deleteAll() {
		Customer c = new Customer(7, "ayush");
		service.deleteAll();
		verify(factory,times(1)).deleteAll();
	}

}
