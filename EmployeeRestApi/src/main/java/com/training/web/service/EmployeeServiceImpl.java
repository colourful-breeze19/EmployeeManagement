package com.training.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.web.dto.EmployeeDao;
import com.training.web.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	
	@Transactional
	public Employee save(Employee emp)
	{
		return empdao.save(emp);
	}
	
	@Transactional
	public Employee get(long id)
	{
		List<Employee> list = (List<Employee>) empdao.get(id);
		Employee employee = list.get(0);
		return employee;
	}
	
	@Transactional
	public List<Employee> list() {
		 return empdao.list();
	}
	
	
	@Transactional
	public void update(int id, Employee emp)
	{
		empdao.update(id,emp);	
	}
	
	@Transactional
	public void delete(long id) 
	{
		 empdao.delete(id);
	 }
}
