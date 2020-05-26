package com.project.service;

import com.project.model.Customer;

public interface CustomerService {

	public int create(Customer cs);
	
	public double calculatePrice(Customer customer);
}
