package com.algo.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.seller.dao.CustomerDao;
import com.algo.seller.dto.Customer;

@Service
public class CustometServiceImp implements CustomerService{

	@Autowired
	private CustomerDao dao;
	
	@Override
	public Customer register(Customer customer) {
		return dao.save(customer);
	}
	

	
}
