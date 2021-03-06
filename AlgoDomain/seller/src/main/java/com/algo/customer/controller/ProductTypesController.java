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
import com.algo.customer.dto.ProductsTypes;
import com.algo.customer.service.ProductTypeService;

@RestController
public class ProductTypesController {

	@Autowired
	private ProductTypeService typeService;
	
	@PostMapping("/addProductTypes")
	public ResponseEntity<?> addProductTypes(@RequestBody ProductsTypes productsTypes){
		ProductsTypes productsTypes2=typeService.addProductTypes(productsTypes);
		return new ResponseEntity<ProductsTypes>(productsTypes,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProductTypes")
	public ResponseEntity<?> deleteProductTypes(int id){
      typeService.deleteProduct(id);
		return new ResponseEntity<String>("its deleted",HttpStatus.OK);
	}
	
	@PutMapping("/updateProductTypes/{id}")
	public ResponseEntity<?> updateProductTypes(@PathVariable int id,@RequestBody ProductsTypes productsTypes){
		typeService.updateProductTypes(productsTypes, id);
		return new ResponseEntity<String>("updated succefully",HttpStatus.OK);
	}
	
	@GetMapping("/viewProductTypes")
	public ResponseEntity<?> viewProductTypes(){
		List<ProductsTypes> products = typeService.viewProductTypes();
		if (!products.isEmpty()) {
			return new ResponseEntity<List<ProductsTypes>> (products,HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("No product found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
