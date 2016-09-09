package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee findEmployee(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

}
