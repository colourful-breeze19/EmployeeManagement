package com.training.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	private int id;
	private int code;
	private String name;
	private String location;
	private String email;
	private String dob;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "code")
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "DOB")
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee()
	{
		
	}
	public Employee(int id, int code, String name, String location, String email, String dob) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", code=" + code + ", name=" + name + ", location=" + location + ", email="
				+ email + ", dob=" + dob + "]";
	}
	
	
}
