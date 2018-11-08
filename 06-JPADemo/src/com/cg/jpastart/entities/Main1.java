package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Student s = null;
		s=em.find(Student.class, 1);
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
