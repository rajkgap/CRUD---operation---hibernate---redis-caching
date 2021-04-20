package com.SDEadda247.CURDCRUDoperation.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SDEadda247.CURDCRUDoperation.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

	Product findByname(String name);
	

}
