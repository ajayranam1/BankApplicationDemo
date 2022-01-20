package com.bank.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.demo.entity.Customer;
import com.bank.demo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	
	@GetMapping("/getCust/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		return customerRepository.findByCustomerId(customerId);
	}
	 
	
}
