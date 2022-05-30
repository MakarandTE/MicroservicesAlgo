package com.algo.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.algo.seller.dao.CartDao;
import com.algo.seller.dto.Cart;
import com.algo.seller.vo.ProductDetails;
import com.algo.seller.vo.ResponseTemlateVO;

public class CartServicesImpl implements CartService{

	@Autowired
	private CartDao dao;
	
	@Override
	public Cart addToCart(Cart cart) {
		return dao.save(cart);
	}

	

	@Override
	public boolean deleteCartItems(int id) {
     Cart cart=dao.findById(id);
     if(cart!=null) {
    	 dao.delete(cart);
    	 return true;
     }
    	return false;
	}



	@Override
	public List<Cart> viewCart(int id) {
		return (List<Cart>) dao.findById(id);
	}



	@Override
	public ResponseTemlateVO responseTemlateVO(int id) {
		ResponseTemlateVO responseTemlateVO=new ResponseTemlateVO();
    dao.findById(id);		
		
		return null;
	}

}
