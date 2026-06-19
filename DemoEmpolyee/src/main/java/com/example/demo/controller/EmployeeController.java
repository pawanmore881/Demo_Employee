package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService es;
	
	
	@GetMapping("display")
	List<Employee>displayEmployee(){
		return es.display();
	}
	
	@PostMapping("add")
	public void addEmployee(Employee e) {
		es.add(e);
	}
	
}
