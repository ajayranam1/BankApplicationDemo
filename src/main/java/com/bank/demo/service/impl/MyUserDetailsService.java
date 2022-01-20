package com.bank.demo.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bank.demo.entity.Customer;
import com.bank.demo.repository.CustomerRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String customerId) throws UsernameNotFoundException {
		Customer customer = customerRepository.findByCustomerId(customerId);
		System.out.println("customer---"+customer);
		if (null == customer) {
			throw new UsernameNotFoundException(customerId);
		}

		return new User(customer.getCustomerId(), customer.getPassword(), new ArrayList<>());
	}

}
