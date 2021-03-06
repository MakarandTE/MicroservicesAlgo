package com.algo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.customer.dao.ProductTypeDao;
import com.algo.customer.dto.ProductsTypes;
@Service
public class ProductTypeServiceImpl implements ProductTypeService{

	@Autowired
	private  ProductTypeDao typeDao;
	
	@Override
	public ProductsTypes addProductTypes(ProductsTypes productsTypes) {
		return typeDao.save(productsTypes);
		}

	@Override
	public boolean deleteProduct(int id) {
		ProductsTypes productsTypes=typeDao.findByProductTypeId(id);
		if (productsTypes!=null) {
			typeDao.delete(productsTypes);
			return true;
		}
		return false;
	}

	@Override
	public ProductsTypes updateProductTypes(ProductsTypes productsTypes, int id) {

		ProductsTypes productsTypes2=typeDao.findByProductTypeId(id);
		if(productsTypes2!=null)
		productsTypes2.setProductTypeName(productsTypes.getProductTypeName());
		typeDao.save(productsTypes2);
		return null;
	}

	@Override
	public List<ProductsTypes> viewProductTypes() {
		return (List<ProductsTypes>) typeDao.findAll();
	}
	

}
