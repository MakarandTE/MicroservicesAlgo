package com.algo.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.seller.dto.Customer;
import com.algo.seller.service.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired 
	private CustomerService service;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody  Customer customer){
	  Customer customer2=service.register(customer);
	  
	  return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
}
