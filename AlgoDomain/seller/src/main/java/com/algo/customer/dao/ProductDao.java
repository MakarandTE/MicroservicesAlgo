package com.algo.customer.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.algo.customer.dto.ProductDetails;

//@EnableJpaRepositories
public interface ProductDao extends CrudRepository<ProductDetails, Integer>{

	public ProductDetails findByProductId(int id);

	@Query("Select e From ProductDetails e Where e.productCategory= :productCategory")
	public Optional<ProductDetails> findByProductCategory(int productCategory);
//	public List<ProductDetails> findByProductCategory(int id);
//	
//	public List<ProductDetails> findByProductType(int id);
}
