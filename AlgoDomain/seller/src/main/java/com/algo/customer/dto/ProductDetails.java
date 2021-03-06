package com.algo.customer.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private String productName;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "categoryId")
	private ProductCategory productCategory;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "productTypeId")
	private ProductsTypes productType;
	
	private int productPriceRange;
	
	private String description;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public ProductsTypes getProductType() {
		return productType;
	}

	public void setProductType(ProductsTypes productType) {
		this.productType = productType;
	}

	public int getProductPriceRange() {
		return productPriceRange;
	}

	public void setProductPriceRange(int productPriceRange) {
		this.productPriceRange = productPriceRange;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
