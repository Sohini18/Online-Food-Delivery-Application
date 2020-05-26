package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CustomerDao;
import com.project.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Override
	public int create(Customer cs) {
		int res=dao.create(cs);
		return res;
	}
	
	public double calculatePrice(Customer customer)
	{
		double price=0.0;
		int quantity=customer.getQuantity();
		if(customer.getItem().equalsIgnoreCase("Sandwich"))
		{
			price=(99*quantity);
			return price;
		}
		else if(customer.getItem().equalsIgnoreCase("Burger"))
		{
			price=129*(customer.getQuantity());
			return price;
		}
		else if(customer.getItem().equalsIgnoreCase("Pizza"))
		{
			price=149*(customer.getQuantity());
			return price;
		}
		else if(customer.getItem().equalsIgnoreCase("French Fries"))
		{
			price=57*(customer.getQuantity());
			return price;
		}
		else if(customer.getItem().equalsIgnoreCase("Chocolate Brownie"))
		{
			price=32*(customer.getQuantity());
			return price;
		}
		else
			return price;
	}

}
