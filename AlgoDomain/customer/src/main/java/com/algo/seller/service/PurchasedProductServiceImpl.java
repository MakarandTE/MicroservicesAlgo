package com.algo.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.seller.dao.PurchasedProductDao;
import com.algo.seller.dto.PurchasedProduct;
@Service
public class PurchasedProductServiceImpl implements PurchasedProductService{

	@Autowired
	private PurchasedProductDao dao;
	
	@Override
	public PurchasedProduct addPurchasedProduct(PurchasedProduct purchasedProduct) {
		return dao.save(purchasedProduct);
	}

	@Override
	public PurchasedProduct viewPurchasedProduct(int id) {
		
		return (PurchasedProduct) dao.findByPurchasedProductId(id);
		
	}

}
