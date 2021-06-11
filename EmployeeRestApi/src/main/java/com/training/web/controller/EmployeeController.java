package com.training.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.web.entity.Employee;
import com.training.web.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@GetMapping(path="/employee",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> list()
	{
		System.out.println("in controller");
		List<Employee> list=empservice.list();
		System.out.println(list);
		return list;
	}

	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployee(@RequestBody Employee emp)
	{
		System.out.println(emp);
		return empservice.save(emp);
	}
	
	
	@GetMapping(path="/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("id") int id)
	{
		Employee employee = empservice.get(id);
		return employee;
	}
	
	@PutMapping(path="/employee/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp)
	{
		System.out.println("Put mapping");
		empservice.update(id,emp);
		return emp;
		
	}
	
	@DeleteMapping(path="/employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.out.println("Delete Mapping");
		empservice.delete(id);
		System.out.println("deleted");
		return ("Employee deleted with id:"+id);
	}
	
}


