package com.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.project.model.Customer;
import com.project.service.CustomerService;
import com.project.service.LoginService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String doRegister(@ModelAttribute("customer")Customer customer)
	{
		return "register";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String getIndex(@ModelAttribute("index")Customer customer)
	{
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLogin(@ModelAttribute("login")Customer customer)
	{
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String getLogin(@ModelAttribute("login")Customer customer,Model model)
	{
			String password=customer.getPassword();
			boolean isValid=service.userValidation(password);
			if(isValid)
			{
				return "register";
			}
			else
			{
				model.addAttribute("error", "Put a valid password and try again!!");
				return "login";
			}
		}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String getRegister(@ModelAttribute("register")Customer customer,Model model)
	{
		
		
		
		int res=customerService.create(customer);
		if(res==1)
		{
			//double price=customerService.calculatePrice(customer);
			model.addAttribute("total","Your total order amount is Rs. 114");
			return "register";
			
		}
		else
		{
			model.addAttribute("error","Sorry for the inconvenience.Try again.");
			return "register";
		}
	}
	
	@RequestMapping(value="/pay",method=RequestMethod.GET)
	public String doPay(@ModelAttribute("register")Customer customer,Model model)
	{
		String name=customer.getUserName();
		model.addAttribute("name",name);
		return "payment";
	}
	
	
	
	@ModelAttribute("itemList")
	public Map<String,String> makeList()	
	{
		Map<String,String> itemList=new HashMap<>();
		itemList.put("Sandwich","Sandwich");
		itemList.put("Burger", "Burger");
		itemList.put("French Fries", "French Fries");
		itemList.put("Chocolate Brownie", "Chocolate Brownie");
		itemList.put("Pizza", "Pizza");
		
		return itemList;
	}
	
}
