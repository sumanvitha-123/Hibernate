package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.business.Employee;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em =emf.createEntityManager();
		
		Employee employee = new Employee();
		employee.setEmp_id(103);
		employee.setEmp_name("Suma");
		employee.setBasic_salary(80000);
		employee.setEmp_Gender('F');
		employee.setEmp_Grade('A');
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(employee);
		t.commit();
		
		em.close();
		emf.close();
		System.out.println("Object is stored in the db");
		
	}

}
