package com.college.inventorymanagement.service;

import com.college.inventorymanagement.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product productDetails);

    void deleteProduct(Long id);

    List<Product> getProductsByCategory(String category);
}
