# java-CRUD-API
# Customer Management REST API – Spring Boot

## Project Overview

A RESTful Customer Management API built using Java, Spring Boot, Spring Data JPA, and H2 Database. The application provides CRUD (Create, Read, Update, Delete) operations to manage customer information, including first name, last name, and email address.

The project follows a layered architecture to separate business logic, request handling, and database operations, improving code maintainability and modularity.

## Features

- Create new customers.
- Retrieve all customer records.
- Retrieve a specific customer by ID.
- Update existing customer information.
- Delete customers by ID.
- Handle missing customer records during update and delete operations.
- Use Optional and lambda expressions for handling customer retrieval and updates.
- Perform database operations using Spring Data JPA.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Spring Boot | Backend framework |
| Spring Data JPA | Database operations |
| Hibernate | Object Relational Mapping (ORM) |
| H2 Database | In-memory database |
| Maven | Build and dependency management |
| REST API | Client-server communication |

## Application Architecture

```text
Client / Postman
       |
       v
Customer Controller
       |
       v
Customer Service
       |
       v
Customer Repository
       |
       v
H2 Database
```

### Controller Layer

Handles incoming HTTP requests and delegates operations to the service layer.

### Service Layer

Contains the business logic for creating, retrieving, updating, and deleting customer records. It also handles missing customer records and manages interactions with the repository layer.

### Repository Layer

Uses Spring Data JPA to perform database operations without manually writing SQL queries for standard CRUD operations.

### Model Layer

Represents the Customer entity and its corresponding database structure.

## CRUD Operations

| Operation | Repository Method | Description |
|---|---|---|
| Create | save() | Creates a new customer |
| Read All | findAll() | Retrieves all customers |
| Read By ID | findById() | Retrieves a specific customer |
| Update | findById() and save() | Updates customer information |
| Delete | existsById() and deleteById() | Checks existence and deletes a customer |

## Key Concepts Implemented

- Object-Oriented Programming (OOP)
- Dependency Injection
- Inversion of Control (IoC)
- Constructor Injection
- Layered Architecture
- Java Generics
- Optional
- Lambda Expressions
- Exception Handling
- RESTful API Development
- Object Relational Mapping (ORM)

## Database

The application uses H2, a lightweight in-memory relational database for development and testing.

The H2 console can be accessed at:

http://localhost:8080/h2-console
