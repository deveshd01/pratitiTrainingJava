package com.pratiti.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.entity.Address;
import com.pratiti.entity.Customer;


public class CustomerAddressDao {

	public void add(Customer cust) {

		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(cust); // Persist generates insert query
//	 		em.merge(product);   // merge generates update query
//	 		em.remove(product);  // remove generates delete query

			em.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			emf.close();
		}

	}

	public void add(Address addr) {

		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(addr); // Persist generates insert query
//	 		em.merge(product);   // merge generates update query
//	 		em.remove(product);  // remove generates delete query

			em.getTransaction().commit();

		} finally {
			emf.close();
		}
	}

	public Customer fetchCust(int id) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			Customer cust = em.find(Customer.class, id);
			return cust;

		} finally {
			emf.close();
		}
	}

	public Address fetchAddr(int id) {
		EntityManagerFactory emf = null;

		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			Address addr = em.find(Address.class, id);
			return addr;

		} finally {
			emf.close();
		}

	}

	public void update(Customer cust) {

		EntityManagerFactory emf = null;
		try {

			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.merge(cust); // merge generates update query

			em.getTransaction().commit();

		} finally {
			emf.close();
			 
		}
	}

	public List<Customer> fetchCustomerByCity(String city) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			String ql = "select c from Customer c join c.address a where a.city = :ct";
			Query q = em.createQuery(ql);
			q.setParameter("ct", city);					// If we want to edit query as per user
			List<Customer> list = q.getResultList();
			return list;

		} finally {
			emf.close();
		}
	}
	
	
	public List<Object[]> fetchAllCustomerInfo() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			String ql = "select c.name, c.DOB, a.city from Customer c join c.address a ";
			Query q = em.createQuery(ql);
			List<Object[]> list = q.getResultList();
			return list;

		} finally {
			emf.close();
		}
	}
}
