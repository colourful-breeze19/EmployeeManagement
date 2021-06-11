package com.training.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.web.entity.User;
import com.training.web.service.UserService;

@RestController
public class UserController
{
	@Autowired
	private UserService userservice;

	@PostMapping(path="/user" ,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User user)
	{
		System.out.println(user);
		return userservice.login(user);
	}
	

}
