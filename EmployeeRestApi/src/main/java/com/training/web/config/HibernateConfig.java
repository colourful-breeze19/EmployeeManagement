package com.training.web.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.training.web.entity.Employee;
import com.training.web.entity.User;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(User.class).buildSessionFactory();
		return sessionFactory;
	}

}
