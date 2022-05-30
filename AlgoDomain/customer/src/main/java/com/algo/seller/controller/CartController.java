package com.algo.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.seller.dto.Cart;
import com.algo.seller.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping("/addCartItems")
	public ResponseEntity<?> addCartItems(@RequestBody  Cart cart){
		Cart cart2=service.addToCart(cart);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	@DeleteMapping("/deleteCartItem")
	public ResponseEntity<?> deleteCartItems(@PathVariable int id){
		service.deleteCartItems(id);
		return new ResponseEntity<String>("cart item deleted",HttpStatus.OK);
	}
	
	@PutMapping("/viewCartItems")
	public ResponseEntity<?> viewCartItems(@RequestBody Cart cart,@PathVariable int id){
		List<Cart> viewCart = service.viewCart(id);    //cntl+1=gices desired type;
		
		return new ResponseEntity<String> ("see  the List",HttpStatus.OK);
	}
}
