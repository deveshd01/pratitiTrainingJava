package com.pratiti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratiti.Exception.CustomerServiceException;
import com.pratiti.entity.Customer;
import com.pratiti.entity.Customer.Status;
import com.pratiti.model.CustomerData;
import com.pratiti.repository.AddressRepo;
import com.pratiti.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private AddressRepo addressRepo;

	public int register(Customer customer) {
		if (!customerRepo.existsByEmail(customer.getEmail())) {
			customer.setStatus(Status.INACTIVE);
			customer.getAddress().setCustomer(customer);
			customerRepo.save(customer);
			return customer.getId();
		} else
			throw new CustomerServiceException("Customer Already Exist");

	}

	public void activate(int id) {
		Optional<Customer> c = customerRepo.findById(id);
		if (c.isPresent()) {
			Customer cData = c.get();
			if (cData.getStatus() != Status.LOCKED) {
				cData.setStatus(Status.ACTIVE);
				customerRepo.save(cData);
			} else
				throw new CustomerServiceException("Account Is Locked Please Contact Admin");
		} else
			throw new CustomerServiceException("Account Does not Exist");

	}

	public Customer login(String email, String password) {
		Optional<Customer> c = customerRepo.findByEmailAndPassword(email, password);
		if (c.isPresent()) {
			if (c.get().getStatus() == Status.ACTIVE) {
				return c.get();
			} else
				throw new CustomerServiceException("User is Not Active");
		} else
			throw new CustomerServiceException("User Does not Exist");

	}
	
	public Customer showInfo(int id) {
		return customerRepo.findById(id).get() ;
	}

}
