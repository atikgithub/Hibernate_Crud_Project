package com.jsp.Controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetAllPerson {
 public static void main(String[] args) {
	PersonService personService= new PersonService();
	List<Person> person= personService.getAllPersonService();
	for(Person person1:person) {
		System.out.println("Id is "+person1.getId());
		System.out.println("Name is "+person1.getName());
		System.out.println("Age is "+person1.getId());
		System.out.println("Email is "+person1.getId());
		//System.out.println("password is "+person1.getId());
	}
	
}
}
