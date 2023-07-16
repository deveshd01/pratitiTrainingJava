package com.pratiti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratiti.entity.Customer;
import com.pratiti.repository.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;

	@RequestMapping("/add-customer")
	public String add(Customer customer, Map model) {
		
		customerRepo.save(customer);
		model.put("id",customer.getId());
		return "confirmation.jsp";
	}
	
	@RequestMapping("/search-customer")
	public String searchByMail(@RequestParam("email") String email, Map model) {
		Customer cust = customerRepo.findByEmail(email).get();
		model.put("c", cust);
		
		return "searchCustomer.jsp";
	}
	
	@RequestMapping("/search-customer-id")
	public String searchByMobile(@RequestParam("id") int id, Map model) {
		Customer cust = customerRepo.findById(id).get();
		model.put("c", cust);
		
		return "searchCustomer.jsp";
	}
	
	@RequestMapping("/search-customer-all")
	public String searchAll(Map model) {
		List<Customer> cust = customerRepo.findAll();
		model.put("c", cust);
		
		return "searchCustomer.jsp";
	}
	
}
