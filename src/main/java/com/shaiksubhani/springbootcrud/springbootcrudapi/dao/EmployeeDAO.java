package com.shaiksubhani.springbootcrud.springbootcrudapi.dao;

import com.shaiksubhani.springbootcrud.springbootcrudapi.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(Integer id);

    void save(Employee employee);

    void delete(int id);
}
