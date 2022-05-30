package com.algo.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.seller.dto.PurchasedProduct;
import com.algo.seller.service.PurchasedProductService;

@RestController
public class PurchasedProductController {

	@Autowired
	private PurchasedProductService service;
	

	@PostMapping("/addPurchasedProducts")
    public ResponseEntity<?> addPurchasedProducts(@RequestBody PurchasedProduct product){
    	PurchasedProduct product2=service.addPurchasedProduct(product);
    	
    	return new ResponseEntity<PurchasedProduct>(product,HttpStatus.OK);
    }
    
    @PutMapping("/viewPurchasedProducts")
    public ResponseEntity<?> viewPurchasedProducts(@PathVariable int id,@RequestBody PurchasedProduct product){
    	service.viewPurchasedProduct(id);
     return new ResponseEntity<PurchasedProduct>(product,HttpStatus.OK);
    }
    
}
