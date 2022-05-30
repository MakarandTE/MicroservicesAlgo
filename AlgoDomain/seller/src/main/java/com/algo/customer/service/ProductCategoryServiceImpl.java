package com.algo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.customer.dao.ProductCategoryDao;
import com.algo.customer.dto.ProductCategory;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryDao categoryDao;
	
	@Override
	public ProductCategory addCategory(ProductCategory productCategory) {

		return categoryDao.save(productCategory);
	}

	@Override
	public boolean deleteCategory(int id) {
		ProductCategory productCategory=categoryDao.findByCategoryId(id);
		if (productCategory !=null) {
			categoryDao.delete(productCategory);
			return true;
		}
		
		return false;
	}

	@Override
	public ProductCategory updateProductCategory(ProductCategory productCategory, int id) {
		ProductCategory productCategory2=categoryDao.findByCategoryId(id);
		if (productCategory2!=null) {
			productCategory2.setCategoryName(productCategory.getCategoryName());
			categoryDao.save(productCategory);
		}
		return null;
	}

	@Override
	public List<ProductCategory> viewProductCategory() {
		return (List<ProductCategory>) categoryDao.findAll();
	}

}
