package com.algo.seller.dao;

import org.springframework.data.repository.CrudRepository;

import com.algo.seller.dto.Cart;

public interface CartDao extends CrudRepository<Cart, Integer>{

	public Cart findById(int id);
}
