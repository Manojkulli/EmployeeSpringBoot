package com.ty.employee.employee_boot.jparepositey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.employee.employee_boot.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
