package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Customer;
import com.backend.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerservices;
	
	@RequestMapping(value="/new-customer", method=RequestMethod.POST)
	public void newcostumer (@RequestBody Customer customers){
		customerservices.addcustomer(customers);
	}
}
