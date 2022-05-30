package com.algo.customer.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.algo.customer.dto.ProductsTypes;

//@EnableJpaRepositories
public interface ProductTypeDao extends CrudRepository<ProductsTypes, Integer> {

	public ProductsTypes findByProductTypeId(int id);
}
