package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao dao = new PersonDao();

	public Person savePersonService(Person person) {
		return dao.save(person);
	}

	public List<Person> getAllPersonService() {
		return dao.getAllPerson();
	}

	public Person getPersonByIdService(int id) {
		return dao.getAllPersonById(id);

	}

	public Person updatePersonService(Person person) {
		return dao.updatePerson(person);

	}

	public Person removePersonService(int id) {
		return dao.removePerson(id);
	}

	public Person loginService(String email, String password) {
		return dao.login(email, password);
	}
}
