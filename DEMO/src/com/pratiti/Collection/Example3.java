package com.pratiti.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// MAP
public class Example3 {
	public static void main(String[] args) {
		Map<Integer,Person> m=new HashMap<>();
		
		 m.put(123,new Person("devesh", 55));
		 m.put(1234,new Person("devh", 554));
		 m.put(12345,new Person("dvesh", 155));
		 m.putIfAbsent(123,new Person("devesh", 55));	// no overRide
		 
		 if(m.get(123)==null) {System.out.println("Key is absent");}
		 
		 // Iterate through map
		 for (Map.Entry<Integer,Person> entry : m.entrySet()) {
	            Integer aadhar = entry.getKey() ;
	            Person p = entry.getValue();
	            System.out.println("aadhar = " + aadhar + ", Person  = " + p);
		 }
		 
		 // for Each loop for MAP
		 m.forEach( (aadhar,p)-> System.out.println("aadhar = " + aadhar + ", Person  = " + p));
		 
		 Set<Integer> sm = m.keySet();		// returns set of all keys
		 Collection<Person> cv = m.values();		// returns Collection of all Values
		 
		Map<Person,Integer> m2=new HashMap<>();
		
		m2.put(new Person("devesh", 55),123);
		 m2.put(new Person("devh", 554),133323);
		 m2.put(new Person("dvesh", 155),12344);
	}
}
