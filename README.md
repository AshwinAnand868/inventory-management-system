# Product Inventory Management System - Spring Boot REST API

A production-ready **Product Inventory REST API** built with **Spring Boot 3**, **Spring Data JPA**, and **MySQL**.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Tech Stack](#-tech-stack)
- [Directory Structure](#-directory-structure)
- [Entity Attributes](#-entity-attributes)
- [REST Endpoints](#-rest-endpoints)
- [Database Setup](#-database-setup)
- [How to Run](#-how-to-run)
- [Postman Testing & Screenshots](#-postman-testing--screenshots)

---

## 📌 Project Overview
- **Entity**: `Product` (`id`, `name`, `category`, `price`, `stockQuantity`, `sku`).
- **Operations**: Full CRUD operations + category filtering.
- **Database**: MySQL integrated with Spring Data JPA (`inventory_db`).
- **Server Port**: `8081` (avoids conflict with other local apps on 8080).
- **Deliverables**: Pre-generated Postman collection, database script, and all 7 screenshots.

---

## 💻 Tech Stack
- **Language:** Java 21
- **Framework:** Spring Boot 3.3.5
- **ORM:** Spring Data JPA / Hibernate
- **Database:** MySQL 8.x
- **Build Tool:** Maven

---

## 🏷️ Entity Attributes

| Attribute | Type | Description |
| :--- | :--- | :--- |
| `id` | `Long` | Primary Key (Auto-increment) |
| `name` | `String` | Product Name |
| `category` | `String` | Category (e.g. Electronics, Office Supplies) |
| `price` | `Double` | Unit Price |
| `stockQuantity` | `Integer` | In-stock quantity |
| `sku` | `String` | Unique Stock Keeping Unit |

---

## 🚀 REST API Endpoints

| HTTP Method | Endpoint | Description | Status Code |
| :--- | :--- | :--- | :--- |
| **POST** | `/api/products` | Add a new product | `201 Created` |
| **GET** | `/api/products` | Retrieve all products | `200 OK` |
| **GET** | `/api/products/{id}` | Retrieve product by ID | `200 OK` (or `404`) |
| **PUT** | `/api/products/{id}` | Update product details | `200 OK` (or `404`) |
| **DELETE** | `/api/products/{id}` | Delete a product | `200 OK` (or `404`) |
| **GET** | `/api/products/category/{category}` | Retrieve products by category | `200 OK` |

---

## 🗄️ Database Setup
Configured in `application.properties`:
```properties
server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
```
`createDatabaseIfNotExist=true` creates the `inventory_db` database automatically on startup.

---

## 🏃 How to Run
1. Open this folder in VS Code or IntelliJ:
   `C:\Users\ashwi\.gemini\antigravity\scratch\inventory-management-system`
2. Open `InventoryManagementApplication.java` and click **Run**.
3. Access at: `http://localhost:8081/api/products`.
