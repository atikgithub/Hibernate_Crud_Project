package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
     Person person= new Person();
     person.setId(5);
     person.setName("Javed Ahmad");
     person.setAge(24);
     person.setEmail("javedahmad77@gmail.com");
     person.setPassword("77777777");
     
     PersonService personService= new PersonService();
     Person person2=personService.savePersonService(person);
     if(person2!=null) {
    	 System.out.println("Data Saved");
     }
     else {
    	 System.out.println("please check the Object");
     }
    
     
     
     
	}

}
