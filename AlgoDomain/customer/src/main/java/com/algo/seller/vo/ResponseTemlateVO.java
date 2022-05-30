package com.algo.seller.vo;

import com.algo.seller.dto.Cart;
import com.algo.seller.dto.Customer;
import com.algo.seller.dto.PurchasedProduct;


public class ResponseTemlateVO {

	private ProductDetails details;
	
	private Cart cart;
	
	private Customer customer;
	
	private PurchasedProduct product;
	
	
	
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PurchasedProduct getProduct() {
		return product;
	}

	public void setProduct(PurchasedProduct product) {
		this.product = product;
	}

	public ProductDetails getDetails() {
		return details;
	}

	public void setDetails(ProductDetails details) {
		this.details = details;
	}

}
