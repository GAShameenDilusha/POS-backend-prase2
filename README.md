# POS Backend (Phase 02)

## Overview
POS Backend is engineered to orchestrate client accounts, merchandise catalogs, sales transactions, and stock levels for a commercial ecosystem. It exposes a suite of RESTful interfaces enabling operations such as generating purchase records, expanding product offerings, and maintaining consumer profiles.

This server-side solution is constructed using the Spring Boot framework, MySQL database, and adheres to industry standards for RESTful API design. It's architected with a focus on extensibility, efficiency, and robust security measures.

## Features
- **Customer Management**: Create, update, delete, and fetch customer details.
- **Product Management**: Manage inventory, including adding, updating, deleting, and fetching product information.
- **Order Processing**: Place orders, view order history, and manage order details.
- **Inventory Tracking**: Track and manage stock levels of products, including reorder levels and pricing.
- **CRUD Operations**: Full support for Create, Read, Update, and Delete operations across all entities.
- **DTOs & Entities**: Implementation of Data Transfer Objects (DTOs) for effective communication between client and server, and entities for database management.

## Technologies Used
- **Backend Framework**: Spring
- **Database**: MySQL
- **ORM**: Hibernate (JPA)
- **API Documentation**: Swagger/OpenAPI (Optional)
- **Build Tool**: Maven

## Prerequisites
- Java 11 or higher
- Maven 3.6+
- MySQL 8.0+