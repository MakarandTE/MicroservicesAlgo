package com.algo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.customer.dto.ProductDetails;
import com.algo.customer.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody ProductDetails productDetails ){
		ProductDetails productDetails2=service.addProduct(productDetails);
		return new ResponseEntity<ProductDetails>(productDetails,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct")
	public ResponseEntity<?> deleteProduct(int id){
      service.deleteProduct(id);
		return new ResponseEntity<String>("its deleted",HttpStatus.OK);
	}
	
	@PutMapping("/updateProducts/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable int id,@RequestBody ProductDetails productDetails){
		service.UpdateDeatils(productDetails, id);
		return new ResponseEntity<String>("updated succefully",HttpStatus.OK);
	}
	
	@GetMapping("/viewProducts")
	public ResponseEntity<?> viewProducts(){
		List<ProductDetails> products = service.viewProducts();
		if (!products.isEmpty()) {
			return new ResponseEntity<List<ProductDetails>> (products,HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("No product found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/byCatagory/{id}")
	public ResponseEntity<?> getProductByCatagory(@PathVariable int id) {
		List<ProductDetails> products = service.productByCategory(id);
		if (!products.isEmpty()) {
			return new ResponseEntity<List<ProductDetails>>(products,HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Something went Worng",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}