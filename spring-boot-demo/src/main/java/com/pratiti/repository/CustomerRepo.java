package com.pratiti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pratiti.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public boolean existsByEmail(String email);
	Optional<Customer> findByEmailAndPassword(String email, String password);
	
	@Modifying
	@Query("update Customer c set c.status ='ACTIVE' where c.id < :id2 and c.status is not 'LOCKED'")
	public void updateStatus(@Param("id2") int id);
}
 