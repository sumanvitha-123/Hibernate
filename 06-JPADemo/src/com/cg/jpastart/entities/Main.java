package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
	System.out.println("creating a bean ..");
	Student student1 = new Student();
	student1.setName("aditi");
	em.persist(student1); //insert 
	em.getTransaction().commit(); //pesist has to be given within a transaction
	System.out.println("Added one student to database.");
	em.close();
	factory.close();
}
}
