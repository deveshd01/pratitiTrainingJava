package com.pratiti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pratiti.entity.Passport;
import com.pratiti.entity.Person;

public class PersonPasswordDao {
	public void add(Person p) {

		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(p); 

			em.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			emf.close();
		}
	}

	public void add(Passport pass) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(pass); 
			em.getTransaction().commit();

		} finally {
			emf.close();
		}
	}
	
	
	public Person fetchperson(int id) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			Person p = em.find(Person.class, id);
			return p;

		} finally {
			emf.close();
		}
	}

	public Passport fetchAddr(int id) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			Passport pass = em.find(Passport.class, id);
			return pass;

		} finally {
			emf.close();
		}

	}

public void update(Passport pass) {
		
		EntityManagerFactory emf = null;
	     try {
			
	    	emf = Persistence.createEntityManagerFactory("hibernate-demo");
	 		EntityManager em = emf.createEntityManager();
	    	 
	    	em.getTransaction().begin();
	 		
//	 		em.persist(product); //Persist generates insert query
	 		em.merge(pass);   // merge generates update query
//	 		em.remove(product);  // remove generates delete query
	 		
	 		em.getTransaction().commit();
	    	 
		} finally {
			emf.close();
		}
	}


}
