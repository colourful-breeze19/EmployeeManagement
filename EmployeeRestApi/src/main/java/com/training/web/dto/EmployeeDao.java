package com.training.web.dto;

import java.util.List;

import com.training.web.entity.Employee;
public interface EmployeeDao {


	Employee save(Employee emp);
	 List<Employee> get(long id);
	 List<Employee> list();
	 void update(int id, Employee emp);
	 void delete(long id);
}
