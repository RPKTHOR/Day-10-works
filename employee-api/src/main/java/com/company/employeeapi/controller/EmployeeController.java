package com.company.employeeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.employeeapi.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(101,"deva","engnr");
	}

}
