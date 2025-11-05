package com.example.ems.service;

import org.springframework.stereotype.Service;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.model.Employee;
import com.example.ems.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee create(Employee emp) {
        if (repo.existsByEmail(emp.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
    }

    public Employee update(Long id, Employee updated) {
        Employee emp = getById(id);
        emp.setName(updated.getName());
        emp.setEmail(updated.getEmail());
        emp.setDepartment(updated.getDepartment());
        emp.setSalary(updated.getSalary());
        return repo.save(emp);
    }

    public void delete(Long id) {
        Employee emp = getById(id);
        repo.delete(emp);
    }

    public List<Employee> searchByDepartment(String dept) {
        return repo.findByDepartmentContainingIgnoreCase(dept);
    }
}
