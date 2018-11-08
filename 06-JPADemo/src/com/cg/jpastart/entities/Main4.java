package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Main4 {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	Trip t =null;
	t= em.find(Trip.class, 1);
	System.out.println(t);
	em.close();
	emf.close();
}
}
