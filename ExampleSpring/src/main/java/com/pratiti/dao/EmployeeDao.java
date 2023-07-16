package com.pratiti.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pratiti.entity.Employee;


// We can Implements this by creating INTERFACE & defining all functions there to achieve loose coupling

@Component("compo_emp_dao")
public class EmployeeDao {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void add(Employee emp){
		em.persist(emp);
	}
	
	public List<Employee> fetchAll(){
		Query q =  em.createQuery("select e from Employee e");
		return q.getResultList();
	}
}
