package com.shaiksubhani.springbootcrud.springbootcrudapi.controller;


import com.shaiksubhani.springbootcrud.springbootcrudapi.model.Employee;
import com.shaiksubhani.springbootcrud.springbootcrudapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get() {
        return employeeService.get();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.get(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable Integer id) {
        employeeService.delete(id);
    }

    @PutMapping("/employee")
    public void updateById(@RequestBody Employee employee){
        employeeService.save(employee);
    }

    //adedd some line
    //added one more line
    //added second line

}
