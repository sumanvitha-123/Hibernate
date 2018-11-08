package com.capgemini.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.business.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
    public boolean addEmployee(Employee employee) {
        // TODO Auto-generated method stub
        try {
               EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
               EntityManager em = emf.createEntityManager();
               em.getTransaction().begin();
               em.persist(employee);
               em.getTransaction().commit();
               return true;
        }
        catch(Exception e) {
        return false;
 }
}


	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try{

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em =emf.createEntityManager();
			
			Employee e =null;
			e = em.find(Employee.class, 102);
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			em.close();
			emf.close();
			return true;
			
		}
		catch(Exception e){
			return false;
		}
		
	}

	@Override
	public boolean removeEmployee(int emp_id) {
		// TODO Auto-generated method stub
		
		try{

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em =emf.createEntityManager();
			
			Employee e =null;
			e = em.find(Employee.class, 102);
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			em.close();
			emf.close();
			return true;
			
		}
		catch(Exception e){
			return false;
		}
	}

	@Override
	public Employee findEmployee(int emp_id) {
		// TODO Auto-generated method stub
		
		
		Employee emp= null;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em =emf.createEntityManager();
			emp= em.find(Employee.class, emp_id);
			return emp;
		}
		catch(Exception e)
		{
			return emp;
		}
		
	}


	@Override
	public List<Employee> getallEmployess() {
		// TODO Auto-generated method stub
		List<Employee> empList = null;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em =emf.createEntityManager();
			Query q= em.createQuery("from employee");
			empList = q.getResultList();
			em.close();
			emf.close();
			return empList;
			
			
		}
		catch(Exception e)
		{
			return empList;
		}
	}
}
