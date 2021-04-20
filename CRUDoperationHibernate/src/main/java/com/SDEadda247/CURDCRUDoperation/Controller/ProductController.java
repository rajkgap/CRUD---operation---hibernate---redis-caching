package com.SDEadda247.CURDCRUDoperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SDEadda247.CURDCRUDoperation.Service.Service;
import com.SDEadda247.CURDCRUDoperation.entity.Product;

@RestController
public class ProductController {
	
	@Autowired
	private Service productservice;
	
	public String get()
	{
		return "Working";
	}
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productservice.SaveProduct(product);
	}
	
	
	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return productservice.SaveProducts(products);
	}
	
	
	@GetMapping("/products")
	public List<Product> findall()
	{
		return productservice.GetAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getbyid(@PathVariable int id)
	{
		return productservice.GetByID(id);
	}
	@GetMapping("/product/{name}")
	public Product getbyname(@PathVariable String name)
	{
		return productservice.GetByname(name); 
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return productservice.Update(product);
	}
	@DeleteMapping("/delete/{name}")
	public String deletebyid(@PathVariable int id)
	{
		return productservice.DeleteByID(id);
		
	}
	

}
