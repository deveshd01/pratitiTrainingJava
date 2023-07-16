package com.pratiti.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratiti.Exception.CustomerServiceException;
import com.pratiti.entity.Customer;
import com.pratiti.model.ActivationStatus;
import com.pratiti.model.CustomerData;
import com.pratiti.model.LoginData;
import com.pratiti.model.LoginStatus;
import com.pratiti.model.RegistrationStatus;
import com.pratiti.service.CustomerService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@CrossOrigin
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
//	@PostMapping("/register")
//	public RegistrationStatus register(@RequestBody Customer customer) {
//		RegistrationStatus status = new RegistrationStatus();
//		try {
//			int cId = customerService.register(customer);
//			status.setStatus(true);
//			status.setMessage("Registration Successfull......!!!!!!");
//			status.setRegisteredCustId(cId);
//		}
//		catch(CustomerServiceException e) {
//			status.setStatus(false);
//			status.setMessage(e.getMessage());
//		}
//		return status;
//	}
	
	@PostMapping("/register")
	public RegistrationStatus register(CustomerData customerData) {
		String folderPath = "C:\\Users\\HP\\Desktop\\SpringBoot\\ImageUploads\\";
		
		RegistrationStatus status = new RegistrationStatus();
		try {
			InputStream f1 = customerData.getProfilePic().getInputStream();
			String imgName = "abc" + customerData.getProfilePic().getOriginalFilename();
			FileOutputStream f2 = new FileOutputStream(folderPath + imgName);
			FileCopyUtils.copy(f1, f2);
			
			Customer customer = new Customer();
			BeanUtils.copyProperties(customerData, customer);
			customer.setProfilePic(imgName);
			
			int cId = customerService.register(customer);
			status.setStatus(true);
			status.setMessage("Registration Successfull......!!!!!!");
			status.setRegisteredCustId(cId);
		}
		catch(IOException | CustomerServiceException e) {
			status.setStatus(false);
			status.setMessage(e.getMessage());
		}
		return status;
	}
	
	@GetMapping("/Activate-Account")
	public ActivationStatus activate(@RequestParam("id") int id) {
		ActivationStatus status = new ActivationStatus();
		try {
			customerService.activate(id);
			status.setStatus(true);
			status.setMessage("Activation Successfull......!!!!!!");
		}
		catch(CustomerServiceException e) {
			status.setStatus(false);
			status.setMessage(e.getMessage());
		}
		return status;
		
	}
	
	@PostMapping("/login")
	public LoginStatus login(@RequestBody LoginData loginData){
		LoginStatus status = new LoginStatus();
		try {
			Customer customer = customerService.login(loginData.getEmail(), loginData.getPassword());
			status.setStatus(true);
			status.setId(customer.getId());
			status.setName(customer.getName());
			status.setMessage("Login Successfull......!!!!!!");
			
		} catch (CustomerServiceException e) {
			status.setStatus(false);
			status.setMessage(e.getMessage());	
		}
		return status;
	}
	
	@GetMapping("/UserInfo")
	public Customer showInfo(@RequestParam int id){
		return customerService.showInfo(id);
	}
	
	
	
	
}
