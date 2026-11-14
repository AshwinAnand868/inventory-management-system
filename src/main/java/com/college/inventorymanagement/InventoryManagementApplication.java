package com.college.inventorymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementApplication.class, args);
        System.out.println("=================================================");
        System.out.println(" Product Inventory System REST API is RUNNING!  ");
        System.out.println(" Base URL: http://localhost:8081/api/products    ");
        System.out.println("=================================================");
    }
}
