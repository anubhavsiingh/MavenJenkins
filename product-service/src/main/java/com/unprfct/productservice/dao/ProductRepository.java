package com.unprfct.productservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unprfct.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	public Product findByProductName(String productName);
	
	public Product findByUnitPrice(float unitPrice);
}
