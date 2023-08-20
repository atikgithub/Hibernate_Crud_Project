package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class LoginPerson {

	public static void main(String[] args) {
		 PersonService personService =new PersonService();
	     Person person=personService.loginService("javedahmad77@gmail.com","12345678");
	     System.out.println("Welcome Login" );
	}

}
