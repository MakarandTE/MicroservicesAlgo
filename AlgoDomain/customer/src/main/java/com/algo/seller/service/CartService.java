package com.algo.seller.service;

import java.util.List;

import com.algo.seller.dto.Cart;
import com.algo.seller.vo.ResponseTemlateVO;

public interface CartService {

	public Cart addToCart(Cart cart);
	
	public List<Cart> viewCart(int id);
	
	public boolean deleteCartItems(int id);
	
	public ResponseTemlateVO responseTemlateVO(int id);
}
