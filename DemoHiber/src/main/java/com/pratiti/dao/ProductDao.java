package com.pratiti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.entity.Product;


//*****************************************  N O T E S  ****************************************************************
// Data Access Object
// Classes contain db communication code is known as dao file
public class ProductDao {
	// when to use em.find() function ?????????????????????????????????????????????????????????????????????????????
	// Inserting Data in table
	public void add(Product product) {
		
		EntityManagerFactory emf = null;
	     try {
			
	    	emf = Persistence.createEntityManagerFactory("hibernate-demo");
	 		EntityManager em = emf.createEntityManager();
	    	 
	    	em.getTransaction().begin();			// RollBack if any Error occurs before clossing this transaction 
	    	// mostly used when DataManipulation occurs
	 		
	 		em.persist(product); //Persist generates insert query
//	 		em.merge(product);   // merge generates update query  // used for BOTH update & insert
//	 		em.remove(product);  // remove generates delete query
	 		
//	 		Product product = em.find(Product.class, id);		return product;
	 		
//	 		Query q =  em.createQuery("select p from Product p");		// HQL Query
//			List<Product>list = q.getResultList();					// Use q.getResultList() function with Query
	 		
//	 		Query q  = em.createQuery("select p.name from Product p where p.price >= :pr");
//			q.setParameter("pr", price);	 // If we want to edit query as per user
//			List<Product>list = q.getResultList();
	 		
//	 		Query q  = em.createQuery("select p from Product p where p.name like :pr");
//			q.setParameter("pr","%"+name+"%");		// Regex
//			List<Product>list = q.getResultList();		
	 		
//	 		String ql = "select a from Song s join s.album a where s.artist = :temp";  
	 		// JOIN Query Song is class album is object of Album in Song

//	 		String hql = "FROM Employee WHERE empName = 'devesh'";		// if name is not variable
	 		
	 		
	 		em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf.close();
		}
	}
	
	// Generalised function(Useful for any Class) // take class name  
//		public Object fetchById(Class cl, int id) {		// id is Primary Key
//			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
//			EntityManager em = emf.createEntityManager();
//
//			return em.find(cl, id);
//		}
	

//	*********************************************************************************************************
	// Fetching data
	public Product fetch(int id) {
		EntityManagerFactory emf =null;
		try {
			
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			
			Product product = em.find(Product.class, id);
			return product;
			
		} finally {
			emf.close();
		}
	}
	
	// Fetching All Data
	@SuppressWarnings("unchecked")
	public List<Product> fetchAll(){
		EntityManagerFactory emf  = null;
		 
		try {
			
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			
			Query q =  em.createQuery("select p from Product p");
			List<Product>list = q.getResultList();
			return list;
			
			
			
		} finally {
            emf.close();
		}		
	}
	
	// Fetching Data by Price
	@SuppressWarnings("unchecked")
	public List<Product> fetchByPrice(double price){
		EntityManagerFactory emf = null;
		try {
			
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			
			Query q  = em.createQuery("select p from Product p where p.price >= :pr");
			q.setParameter("pr", price);
			List<Product>list = q.getResultList();
			
			return list;
			
		} finally {
			emf.close();		}
	}
	
	// Fetching Data by Name
	@SuppressWarnings("unchecked")
	public List<Product>fetchByName(String name){
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			
			Query q  = em.createQuery("select p from Product p where p.name like :pr");
			q.setParameter("pr","%"+name+"%");		// Regex
			List<Product>list = q.getResultList();
			
			return list;
			
		} finally {
			emf.close();		}
	}

	// Updating the Data
	public void update(Product product) {
		
		EntityManagerFactory emf = null;
	     try {
			
	    	emf = Persistence.createEntityManagerFactory("hibernate-demo");
	 		EntityManager em = emf.createEntityManager();
	    	 
	    	em.getTransaction().begin();
	 		
//	 		em.persist(product); //Persist generates insert query
	 		em.merge(product);   // merge generates update query
//	 		em.remove(product);  // remove generates delete query
	 		
	 		em.getTransaction().commit();
	    	 
		} finally {
			emf.close();
		}
	}
	
	// Deleting the data
	public Product delete(int id) {
		
		EntityManagerFactory emf = null;
	     try {
			
	    	emf = Persistence.createEntityManagerFactory("hibernate-demo");
	 		EntityManager em = emf.createEntityManager();
	    	 
	    	em.getTransaction().begin();
			Product product = em.find(Product.class, id);
	 		
//	 		em.persist(product); //Persist generates insert query
//	 		em.merge(product);   // merge generates update query  // used for BOTH update & insert
	 		em.remove(product);  // remove generates delete query
	 		
	 		em.getTransaction().commit();
	    	 
		} finally {
			emf.close();
		}
		return null;
	}
}
