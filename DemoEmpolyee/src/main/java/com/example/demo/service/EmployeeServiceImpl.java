package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository er;

    @Override
    public void add(Employee e) {
        er.save(e);
    }

    @Override
    public List<Employee> display() {
        return er.findAll();
    }
}