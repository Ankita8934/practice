package com.practice.pracApi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.practice.pracApi.model.Customer;
import com.practice.pracApi.repo.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer createCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
}
