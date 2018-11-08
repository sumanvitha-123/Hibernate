package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Main2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String myQuery = " from Student";
		Query query = em.createQuery(myQuery);
		String name =" ";
		List<Student> empList = null;
		empList = query.getResultList();
		for (Student student : empList) {
			student.setName(student.getName().toUpperCase());
			em.merge(student);
			
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
