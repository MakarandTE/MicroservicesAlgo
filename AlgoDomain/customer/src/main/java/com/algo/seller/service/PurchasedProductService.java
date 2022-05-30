package com.algo.seller.service;

import com.algo.seller.dto.PurchasedProduct;

public interface PurchasedProductService {

	public PurchasedProduct addPurchasedProduct(PurchasedProduct purchasedProduct);
	
	public PurchasedProduct viewPurchasedProduct(int id);
}
