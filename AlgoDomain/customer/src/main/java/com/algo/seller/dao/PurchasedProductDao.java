package com.algo.seller.dao;

import org.springframework.data.repository.CrudRepository;

import com.algo.seller.dto.PurchasedProduct;

public interface PurchasedProductDao extends CrudRepository<PurchasedProduct, Integer> {

	public PurchasedProductDao findByPurchasedProductId(int id);

	
	
}
