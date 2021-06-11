package com.training.web.service;

import java.util.List;

import com.training.web.entity.Employee;
public interface EmployeeService {

	Employee save(Employee emp);
	 Employee get(long id);
	 List<Employee> list();
	 void update(int id, Employee emp);
	 void delete(long id);
}
