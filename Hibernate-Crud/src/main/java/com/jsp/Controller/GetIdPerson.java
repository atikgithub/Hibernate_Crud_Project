package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetIdPerson {

	public static void main(String[] args) {
		PersonService personService= new PersonService();
		Person person1= personService.getPersonByIdService(1);
		System.out.println("Id is "+person1.getId());
		System.out.println("Name is "+person1.getName());
		System.out.println("Age is "+person1.getAge());
		System.out.println("Email is "+person1.getEmail());
		System.out.println("password is "+person1.getPassword());

	}

}
