package com.algo.customer.service;

import java.util.List;

import com.algo.customer.dto.ProductCategory;
import com.algo.customer.dto.ProductDetails;

public interface ProductCategoryService {

	public ProductCategory addCategory(ProductCategory productCategory);
	
	public boolean deleteCategory(int id);
	
	public ProductCategory updateProductCategory(ProductCategory productCategory,int id);
	
	public List<ProductCategory> viewProductCategory();
	}
