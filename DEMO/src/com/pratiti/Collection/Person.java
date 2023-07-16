package com.pratiti.Collection;
import java.util.Objects;

public class Person  {		//implements Comparable<Person>
	private String name;
	private int age;
	
	public Person() {
		this.name = "Devesh";
		this.age = 23;
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		
//		return this.name.equals(p.name) && this.age==p.age;
//	}

//	
////add implements in declaration of class
//	public int compareTo(Person o2){ 
//		if(this.getName().equals(o2.getName()))
//			return this.getAge()-o2.getAge();  
//		return this.getName().compareTo(o2.getName());
//	}
	
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode called....");
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called....");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

// TO MAKE PRINTLN() WORKING
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	Comparable<Person> {
//		
////		if(o1.getName().equals(o2.getName()))
//			return o1.getAge()-o2.getAge();
////		return o1.getName()-o2.getName();
//	}


	public static void main(String[] args) {
		Person p1=new Person("Rohit",22);
		System.out.println(p1.getName()+"  ->  "+p1.getAge());
		System.out.println(p1);
		
		Person p2=new Person("Rohit",22);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}
	
	
	

}
