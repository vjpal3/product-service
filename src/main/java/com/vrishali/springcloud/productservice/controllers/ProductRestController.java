package com.vrishali.springcloud.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrishali.springcloud.productservice.model.Product;
import com.vrishali.springcloud.productservice.repository.ProductRepository;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
	
	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/products")
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
}
