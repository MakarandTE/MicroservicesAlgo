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

import com.algo.customer.dto.ProductCategory;
import com.algo.customer.dto.ProductDetails;
import com.algo.customer.service.ProductCategoryService;

@RestController
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService categoryService;

	@PostMapping("/addCategory")
	public ResponseEntity<?> addProductCategory(@RequestBody ProductCategory productCategory){
		ProductCategory productCategory2=categoryService.addCategory(productCategory);
		return new ResponseEntity<ProductCategory>(productCategory,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProductCategory")
	public ResponseEntity<?> deleteProductCategory(int id){
      categoryService.deleteCategory(id);
		return new ResponseEntity<String>("its deleted",HttpStatus.OK);
	}
	
	@PutMapping("/updateProductCategory/{id}")
	public ResponseEntity<?> updateProductCategory(@PathVariable int id,@RequestBody ProductCategory productCategory){
		categoryService.updateProductCategory(productCategory, id);
		return new ResponseEntity<String>("updated succefully",HttpStatus.OK);
	}
	
	@GetMapping("/viewProductsCategory")
	public ResponseEntity<?> viewProductsCategory(){
		List<ProductCategory> products = categoryService.viewProductCategory();
		if (!products.isEmpty()) {
			return new ResponseEntity<List<ProductCategory>> (products,HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("No product found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
