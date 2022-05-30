package com.algo.seller.dao;

import org.springframework.data.repository.CrudRepository;

import com.algo.seller.dto.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{

	public Customer findByCustomerId(int id);
}
