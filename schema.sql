CREATE TABLE IF NOT EXISTS employees (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255) UNIQUE,
  department VARCHAR(255),
  salary DOUBLE
);

INSERT INTO employees (name, email, department, salary) VALUES
('Ayesha Kumar', 'ayesha@example.com', 'IT', 50000),
('Rahul Verma', 'rahul@example.com', 'HR', 30000),
('Sana Ali', 'sana@example.com', 'Finance', 45000);
