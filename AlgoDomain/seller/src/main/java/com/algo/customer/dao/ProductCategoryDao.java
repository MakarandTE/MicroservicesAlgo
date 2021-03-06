package com.algo.customer.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.algo.customer.dto.ProductCategory;

//@EnableJpaRepositories
public interface ProductCategoryDao extends CrudRepository<ProductCategory, Integer> {
 
	public ProductCategory findByCategoryId(int id); 
}
