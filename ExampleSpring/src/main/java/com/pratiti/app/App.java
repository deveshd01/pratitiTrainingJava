package com.pratiti.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.dao.EmployeeDao;
import com.pratiti.entity.Employee;


public class App {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLconfig.xml");
	EmployeeDao obj = (EmployeeDao) ctx.getBean("compo_emp_dao");
	
	// Use this obj to access methods of component/dao class & fulfill the requirements
	
		
//		int i=2;		
//		for(;i<10;i++) {
//			Employee e = new Employee();
//			e.setName("Devesh"+i);
//			e.setAge(22+i);
//			obj.add(e);
//		}

		List<Employee> ls = obj.fetchAll();
		System.out.println("ID     name      age");
		for(Employee e:ls) {
			System.out.print(e.getEmpId());
			System.out.print("    "+e.getName());
			System.out.println("    "+e.getAge());
		}
		
		
		
	}
	
}
