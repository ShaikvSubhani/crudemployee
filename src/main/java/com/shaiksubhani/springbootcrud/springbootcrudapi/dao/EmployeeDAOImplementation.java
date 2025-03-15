package com.shaiksubhani.springbootcrud.springbootcrudapi.dao;

import com.shaiksubhani.springbootcrud.springbootcrudapi.model.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> listOfEmployees = query.getResultList();
        return listOfEmployees;
    }

    @Override
    public Employee get(Integer id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee employee=currentSession.get(Employee.class,id);
        currentSession.delete(employee);
    }
}
