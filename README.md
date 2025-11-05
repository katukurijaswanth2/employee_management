A Java Spring Boot Project by Jaswanth Katukuri (MCA Graduate)
Project Overview

The Employee Management System (EMS) is a backend web application developed using Spring Boot and MySQL.
It helps organizations manage employee information efficiently by providing secure CRUD (Create, Read, Update, Delete) operations through RESTful APIs.

This project demonstrates my understanding of Spring Boot architecture, RESTful services, and database integration using JPA (Hibernate) — developed as part of my learning journey in Java Full Stack Development.
objective:
Build a RESTful API for managing employee data.

Implement Spring Boot with layered architecture (Controller → Service → Repository).

Integrate MySQL database using Spring Data JPA.

Add validation, exception handling, and clean coding practices.

Practice real-world backend project development as part of my MCA course and full-stack learning.

Tech Stack

| Category            | Technology                  |
| ------------------- | --------------------------- |
| **Language**        | Java 17                     |
| **Framework**       | Spring Boot 3               |
| **Database**        | MySQL (H2 used for testing) |
| **ORM**             | Spring Data JPA             |
| **Build Tool**      | Maven                       |
| **Testing Tool**    | Postman                     |
| **IDE**             | IntelliJ IDEA / Eclipse     |
| **Version Control** | Git & GitHub                |
Features

✅ Add a new employee record
✅ Fetch employee details (single or list)
✅ Update existing employee information
✅ Delete employee by ID
✅ Search employees by department
✅ Input validation (email, salary, etc.)
✅ Exception handling for missing or invalid data
✅ Clean and modular code structure following best practices
Database Design
| Column     | Type     | Description                |
| ---------- | -------- | -------------------------- |
| id         | INT (PK) | Auto-generated Employee ID |
| name       | VARCHAR  | Employee name              |
| email      | VARCHAR  | Unique email ID            |
| department | VARCHAR  | Department name            |
| salary     | DOUBLE   | Monthly salary             |
| Column     | Type     | Description                |

API Endpoints
| Method | Endpoint                              | Description                    |
| ------ | ------------------------------------- | ------------------------------ |
| GET    | `/api/employees`                      | Get all employees              |
| GET    | `/api/employees/{id}`                 | Get employee by ID             |
| POST   | `/api/employees`                      | Add a new employee             |
| PUT    | `/api/employees/{id}`                 | Update existing employee       |
| DELETE | `/api/employees/{id}`                 | Delete employee by ID          |
| GET    | `/api/employees/search?department=IT` | Search employees by department |


Setup & Run Instructions
1. Clone the Repository
git clone https://github.com/katukurijaswanth2/employee_management.git
cd employee_management

2. Configure Database

Open src/main/resources/application.properties and update:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword
3. Run the Application
mvn spring-boot:run



