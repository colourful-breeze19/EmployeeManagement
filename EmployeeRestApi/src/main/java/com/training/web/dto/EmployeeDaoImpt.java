package com.training.web.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.training.web.config.HibernateConfig;
import com.training.web.entity.Employee;
@Repository
public class EmployeeDaoImpt implements EmployeeDao {

	private  static SessionFactory sessionfactory = HibernateConfig.getSessionFactory();
	
	public Employee save(Employee emp)
	{
		Session session = sessionfactory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(emp);
        tx.commit();
        return emp;
	}
	
	 public List<Employee> get(long id)
	 {
		 List<Employee> list = sessionfactory.openSession().createQuery("from Employee e where e.id='" + id + "'").list();
		 return list;
	 } 
	 
	public List<Employee> list(){
		 List<Employee> list=sessionfactory.openSession().createQuery("from Employee").list();
		 return list;
	 }
	
	public void update(int id, Employee emp) 
	{
		Session session = sessionfactory.openSession();
        Transaction tx= session.beginTransaction();
         Employee oldemp=session.byId(Employee.class).load(id);
         oldemp.setCode(emp.getCode());
         oldemp.setName(emp.getName());
         oldemp.setDob(emp.getDob());
         oldemp.setEmail(emp.getEmail());
         oldemp.setLocation(emp.getLocation());
         tx.commit();
         session.close();
	 }
	
	
	public void delete(long id)
	{
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete Employee e where e.id='" + id + "'").executeUpdate();
		tx.commit();
	}
}
