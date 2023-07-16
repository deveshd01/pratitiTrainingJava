package com.pratiti.App;

import java.time.LocalDate;
import java.util.List;

import com.pratiti.dao.CustomerAddressDao;
import com.pratiti.entity.Address;
import com.pratiti.entity.Customer;


public class CustomerAddressApp {
	public static void main(String[] args) {
		CustomerAddressDao dao = new CustomerAddressDao();
		
		
		// Adding new Customer
		Customer customer = new Customer();
		customer.setName("DeveshDDDD");
		customer.setEmail("deveshdddddd@gmail.com");
		customer.setDOB(LocalDate.of(2017, 1, 13));
//		dao.add(customer);
		
		
//		System.out.println(c.getName() + "    " + c.getEmail() + "    " + c.getDOB());
		
		
		// Adding address of the Existing customer
//		Customer c = dao.fetchCust(3);
		
		
		Address address = new Address();
		address.setLine1("deron Heights");
		address.setLine2("baner ddddd");
		address.setCity("pune");
		address.setPincode(55555);
		
//		c.setAddress(address);	
//		dao.update(c);
		
		
		List<Customer> l = dao.fetchCustomerByCity("pune");
		for(Customer c:l) {
			System.out.println(c.getName() + "  -->  " + c.getId());
		}
		
		List<Object[]> t = dao.fetchAllCustomerInfo();
		for(Object[] i:t) {
			System.out.println(i[0] + " --->   " + i[1] + " --->   " + i[2] );
			
		}
		
	}
}
