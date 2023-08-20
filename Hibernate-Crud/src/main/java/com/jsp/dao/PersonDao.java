package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {
 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashi");
  public Person save(Person person) {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  if(person!=null)
	  {
	  entityTransaction.begin();
	  entityManager.persist(person);
	  entityTransaction.commit();
	  }
	return person;
	  
  }
  public List<Person> getAllPerson() {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  Query query= entityManager.createQuery("select a from Person a");
	  
	return query.getResultList();  	  
  }
  
  public Person getAllPersonById(int id) {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  return entityManager.find(Person.class, id);
	  
  }
  public Person removePerson(int id) {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction(); 
	  Person person=entityManager.find(Person.class, id);
      if(person!= null) {
    	  entityTransaction.begin();
    	  entityManager.remove(person);
    	  entityTransaction.commit();
      }
	  return person; 	  
  }
  
  public Person updatePerson(Person person) {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction(); 
      if(person!= null) {
    	  entityTransaction.begin();
    	  entityManager.merge(person);
    	  entityTransaction.commit();
      }
	  return person; 	  
  }
  public Person login(String email,String password) {
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  Query query= entityManager.createQuery("select a from Person a where email=?1 and password=?2");
	  query.setParameter(1,email);
	  query.setParameter(2,password);
      List<Person> list= query.getResultList();
	return list.get(0);
	  
  }
}

