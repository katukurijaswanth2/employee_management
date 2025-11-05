# Employee Management System (Spring Boot)

## Overview
Simple backend-only Spring Boot project for managing employees.
Includes CRUD APIs, validation, exception handling, and sample data.

## Run locally (quick)
1. Java 17+ and Maven installed.
2. From project root run:
   mvn spring-boot:run
3. The app runs at http://localhost:8080
4. APIs:
   GET  /api/employees
   GET  /api/employees/{id}
   POST /api/employees
   PUT  /api/employees/{id}
   DELETE /api/employees/{id}
   GET  /api/employees/search?department=IT

## Notes
- By default app uses H2 in-memory database for quick testing.
- To use MySQL, update `src/main/resources/application.properties` with MySQL datasource and credentials.
- Schema and sample data provided in `schema.sql`.
- Swagger UI is available at: http://localhost:8080/swagger-ui.html (after app starts)
