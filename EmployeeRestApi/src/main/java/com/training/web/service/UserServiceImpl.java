package com.training.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.web.dto.UserDao;
import com.training.web.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;

	public User login(User user) 
	{
		return userdao.login(user);
	}

}
