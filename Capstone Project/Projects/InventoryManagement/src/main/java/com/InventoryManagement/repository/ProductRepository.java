package com.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InventoryManagement.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
