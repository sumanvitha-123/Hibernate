package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main3 {
	public static void main(String[] args) {
		SeatInfo info = new SeatInfo(15,20,8);
		Trip trip = new Trip();
		trip.setFrom_city("chennai");
		trip.setTo_city("mumbai");
		trip.setInfo(info);
		
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(trip);
		t.commit();
		
		em.close();
		emf.close();
		System.out.println("Object is stored in the db");
	}

}
