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
public class ProductsTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productTypeId;
	
	private String productTypeName;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "categoryId")
	private ProductCategory catagoryId;
	
	
	public int getProductTypeId() {
		return productTypeId;
	}
	
	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}
	
	public String getProductTypeName() {
		return productTypeName;
	}
	
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	
	public ProductCategory getCatagoryId() {
		return catagoryId;
	}
	
	public void setCatagoryId(ProductCategory catagoryId) {
		this.catagoryId = catagoryId;
	}
	
	
}
