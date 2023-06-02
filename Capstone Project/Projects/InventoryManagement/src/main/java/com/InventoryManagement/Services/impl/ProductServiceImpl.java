package com.InventoryManagement.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InventoryManagement.Services.ProductService;
import com.InventoryManagement.entities.Product;
import com.InventoryManagement.repository.ProductRepository;

@Service

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	//Post Method Implementation
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}
	@Override
	//Get Method Implementation
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
	@Override
	//Get By Id Implementation
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	//Delete Method Implementation
	public String deleteProduct(Integer id) {
		
		 Product product = productRepo.findById(id).get();
		 //if(product != null)
		// {
			 productRepo.delete(product);
			 return "Product deleted Successfully";
		// }
		// return "Something Went Wrong";
	}

	@Override
	//Put Method Implementation
	public Product editProduct(Product product, Integer id) {
		Product oldProduct = productRepo.findById(id).get();
		oldProduct.setProductName(product.getProductName());
		oldProduct.setQuantity(product.getQuantity());
		oldProduct.setWarranty(product.getWarranty());
		oldProduct.setBillNumber(product.getBillNumber());
		oldProduct.setDate(product.getDate());
		
		return productRepo.save(oldProduct);
	}

}
