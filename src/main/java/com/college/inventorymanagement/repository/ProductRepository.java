package com.college.inventorymanagement.repository;

import com.college.inventorymanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * Retrieve products by category (case-insensitive).
     */
    List<Product> findByCategoryIgnoreCase(String category);

    /**
     * Check if a product with the specified SKU already exists.
     */
    boolean existsBySku(String sku);
}
