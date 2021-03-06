package com.algo.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.customer.dao.ProductDao;
import com.algo.customer.dto.ProductDetails;

@Service
public class ProductServicesImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public ProductDetails addProduct(ProductDetails productsDetails) {
		return dao.save(productsDetails);
	}

	@Override
	public boolean deleteProduct(int id) {
		ProductDetails productDetails = dao.findByProductId(id);
		if (productDetails != null) {
			dao.delete(productDetails);
			return true;
		}
		return false;
		
	}

	@Override
	public ProductDetails UpdateDeatils(ProductDetails productDetails,int id) {
		ProductDetails productDetails2=dao.findByProductId(id);
		if (productDetails2!=null) {
			productDetails2.setProductName(productDetails.getProductName());
			productDetails2.setDescription(productDetails.getDescription());
			productDetails2.setProductCategory(productDetails.getProductCategory());
			productDetails2.setProductPriceRange(productDetails.getProductPriceRange());
			productDetails2.setProductType(productDetails.getProductType());
			dao.save(productDetails2);
			
		}
		return null ;
	}

	@Override
	public List<ProductDetails> viewProducts() {
		return (List<ProductDetails>) dao.findAll();
	}

	

	
	@Override
	public List<ProductDetails> productByCategory(int id) {
		Optional<ProductDetails> products = dao.findByProductCategory(id);
		ArrayList<ProductDetails> list = new ArrayList<ProductDetails>();
		products.ifPresent(list::add);
		return list;
	}

}
