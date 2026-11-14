-- =======================================================
-- Product Inventory Management System Database Script
-- =======================================================

CREATE DATABASE IF NOT EXISTS inventory_db;
USE inventory_db;

CREATE TABLE IF NOT EXISTS products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    stock_quantity INT NOT NULL,
    sku VARCHAR(255) NOT NULL UNIQUE
);

-- Optional initial seed data
INSERT INTO products (name, category, price, stock_quantity, sku) VALUES
('Wireless Mechanical Keyboard', 'Electronics', 89.99, 45, 'ELEC-KEY-001'),
('Ergonomic Gaming Mouse', 'Electronics', 49.99, 120, 'ELEC-MOU-002'),
('Standing Desk Mat', 'Office Supplies', 29.50, 75, 'OFF-MAT-003'),
('USB-C 4K Monitor Cable', 'Electronics', 15.99, 200, 'ELEC-CAB-004')
ON DUPLICATE KEY UPDATE name=name;

SELECT * FROM products;
