package com.algo.seller.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchasedProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchasedProductId;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "productId")
	private Customer customer;
	
	private int productId;

	public int getPurchasedProductId() {
		return purchasedProductId;
	}

	public void setPurchasedProductId(int purchasedProductId) {
		this.purchasedProductId = purchasedProductId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}
