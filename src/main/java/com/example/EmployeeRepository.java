package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public List<Employee> findByName(String name);
}
