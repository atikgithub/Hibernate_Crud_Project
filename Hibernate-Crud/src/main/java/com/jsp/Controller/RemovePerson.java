package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class RemovePerson {

	public static void main(String[] args) {
		 PersonService personService =new PersonService();
	     Person person=personService.removePersonService(5);
	     if(person!= null) {
	    	 System.out.println("Data Deleted");
	     }
	     else {
	    	 System.out.println("plz check your object");
	     }
	}

}
