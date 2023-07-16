package com.pratiti.App;

import java.time.LocalDate;

import com.pratiti.dao.PersonPasswordDao;
import com.pratiti.entity.Passport;
import com.pratiti.entity.Person;

public class PersonPassportApp {

	public static void main(String[] args) {
		PersonPasswordDao dao = new PersonPasswordDao();
		
		Person p = new Person();
		p.setAge(22);
		p.setName("devesh");
//		dao.add(p);
		
		Passport pas = new Passport();
		pas.setIssueDate(LocalDate.of(2000, 1, 1));
		pas.setExpDate(LocalDate.of(2010, 11, 22));

		pas.setPerson(p);		// joining primary  foreign key
		
		dao.add(pas);			// adding in table which have FK 

	}

}
