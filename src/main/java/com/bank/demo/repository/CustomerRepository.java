package com.bank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByCustomerId(String customerId);

}
