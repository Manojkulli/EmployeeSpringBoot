package com.ty.employee.employee_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.employee.employee_boot.dao.EmployeeDao;
import com.ty.employee.employee_boot.dto.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao dao;

	@PostMapping("save")
	public Employee saveEmp(@RequestBody Employee employee) {

		return dao.saveEmployee(employee);
	}
	
	@GetMapping("get")
	public Employee getById(@RequestParam int id) {
		return dao.getById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		return dao.deleteById(id);
	}

}
