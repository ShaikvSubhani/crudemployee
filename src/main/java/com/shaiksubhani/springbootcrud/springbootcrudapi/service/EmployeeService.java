package com.shaiksubhani.springbootcrud.springbootcrudapi.service;

import com.shaiksubhani.springbootcrud.springbootcrudapi.model.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> get();

    Employee get(Integer id);

    void save(Employee employee);

    void delete(int id);
}
