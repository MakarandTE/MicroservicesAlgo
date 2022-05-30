package com.algo.customer.service;

import java.util.List;

import com.algo.customer.dto.ProductDetails;

public interface ProductService {

	public ProductDetails addProduct(ProductDetails productsDetails);
	
	public boolean deleteProduct(int id);
	
	public ProductDetails UpdateDeatils(ProductDetails productDetails,int id);
	
	public List<ProductDetails> viewProducts();
	
	public List<ProductDetails> productByCategory(int id);

}
