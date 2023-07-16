package demo;

import java.util.ArrayList;
import java.util.List;

class User{
	public String name;
	public String pass;
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
}

class Manager{
	List<User>  l;
	
	Manager(){
		l=new ArrayList<>();
		l.add(new User("devesh1", "123"));
		l.add(new User("devesh2", "1234"));
		l.add(new User("devesh3", "12345"));
		l.add(new User("devesh4", "123456"));
	}
	
	boolean isValidUser(String name, String pass) {

//		for(User i:l) 
//			if(i.name.equals(name) && i.pass.equals(pass))
//				return true;
//		return false;
		
		return l
				.stream()
				.anyMatch(i->i.name.equals(name) && i.pass.equals(pass));
	}
}


public class D1 {
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.isValidUser("devesh3", "12345"));
	}

}
