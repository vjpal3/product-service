package com.vrishali.springcloud.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrishali.springcloud.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
