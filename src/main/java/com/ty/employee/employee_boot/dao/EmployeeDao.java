package com.ty.employee.employee_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.employee.employee_boot.dto.Employee;
import com.ty.employee.employee_boot.jparepositey.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo repo;

	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee getById(int id) {
		return repo.findById(id).get();
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "deleted";
	}

}
