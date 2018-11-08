package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Contact;

public class Main5 {
	public static void main(String[] args) {
		Contact contact1 = new Contact(101,"suma","9989090808");
		Contact contact2 = new Contact(102,"lahari","8987678963");
		Contact contact3 = new Contact(103,"anu","7898767899");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		/*em.persist(contact1);
		em.persist(contact2);
		em.persist(contact3);*/
		
		contact3.setPhoneNum("7898767899");
		em.merge(contact3);
		em.close();
		emf.close();
		Contact contact4 = null;
		emf = Persistence.createEntityManagerFactory("JPA-PU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		contact4 = em.find(Contact.class, 103);
		contact4.setPhoneNum("7898778987");
		em.merge(contact4);
		em.getTransaction().commit();
		System.out.println(contact4.equals(contact3));
		em.close();
		emf.close();
}

}
