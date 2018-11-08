package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Address address = em.find(Address.class, 1);
		System.out.println(address.getCity()+" "+address.getStreet()+" "+address.getState()+" "+address.getZipCode());
		Student student = em.find(Student.class, 8);
		System.out.println(student.getName()+"  "+student.getAddress().getStreet()+" "+student.getAddress().getCity()+" "+student.getAddress().getState());
		
		em.close();
		emf.close();
	
	}

}
