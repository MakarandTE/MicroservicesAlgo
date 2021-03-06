package com.algo.customer.service;

import java.util.List;

import com.algo.customer.dto.ProductDetails;
import com.algo.customer.dto.ProductsTypes;

public interface ProductTypeService {

	public ProductsTypes addProductTypes(ProductsTypes productsTypes);
	public boolean deleteProduct(int id);
	
	public ProductsTypes updateProductTypes(ProductsTypes productsTypes,int id);
	
	public List<ProductsTypes> viewProductTypes();
}
