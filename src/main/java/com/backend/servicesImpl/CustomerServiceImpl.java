package com.backend.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.CustomerDao;
import com.backend.model.Customer;
import com.backend.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerdao;
	
	public void addcustomer (Customer customers){
		customerdao.save(customers);
	}
}
