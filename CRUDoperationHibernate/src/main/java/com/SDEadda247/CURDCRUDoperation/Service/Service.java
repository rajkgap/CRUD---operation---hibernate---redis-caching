package com.SDEadda247.CURDCRUDoperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SDEadda247.CURDCRUDoperation.ProductRepository.ProductRepo;
import com.SDEadda247.CURDCRUDoperation.entity.Product;

public class Service {

	@Autowired
	private ProductRepo productRepo;

	public Product SaveProduct(Product product) //// POST METHOD
	{
		return productRepo.save(product);
	}

	public List<Product> SaveProducts(List<Product> products) //// POST METHOD
	{
		return productRepo.saveAll(products);
	}

	public List<Product> GetAll() //// GET METHOD
	{
		return productRepo.findAll();
	}

	public Product GetByID(int id) //// GET METHOD
	{
		return productRepo.findById(id).orElse(null);
	}

	public Product GetByname(String name) //// GET METHOD
	{
		return productRepo.findByname(name);
	}

	public String DeleteByID(int id) //// DELETE METHOD
	{
		productRepo.deleteById(id);
		return "DATA DELETED.";
	}

	public Product Update(Product product) //// UPDATE METHOD
	{
		Product oldproduct = productRepo.findById(product.getId()).orElse(null);
		oldproduct.setName(product.getName());
		oldproduct.setPrice(product.getPrice());
		oldproduct.setQuntity(product.getQuntity());
		return productRepo.save(oldproduct);
	}

}
