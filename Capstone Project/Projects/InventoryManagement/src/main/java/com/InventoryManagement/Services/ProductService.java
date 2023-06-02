package com.InventoryManagement.Services;

import java.util.List;

import com.InventoryManagement.entities.Product;

public interface ProductService {
	public List<Product> getAllProduct();

	Product saveProduct(Product product);

	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);
	
	public Product editProduct(Product product,Integer id);
}
