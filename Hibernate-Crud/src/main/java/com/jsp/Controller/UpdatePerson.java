package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {
		 Person person= new Person();
	     person.setId(1);
	     person.setName("Javed Ahmad");
	     person.setAge(24);
	     person.setEmail("javedahmad77@gmail.com");
	     person.setPassword("12345678");
	     
	     PersonService personService =new PersonService();
	     Person person2=personService.updatePersonService(person);
	     if(person2!= null) {
	    	 System.out.println("Data Updated");
	     }
	     else {
	    	 System.out.println("plz check your object");
	     }

	}

}
