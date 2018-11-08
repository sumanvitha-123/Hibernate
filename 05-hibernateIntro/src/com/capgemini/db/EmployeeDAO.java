package com.capgemini.db;

import java.util.List;

import com.capgemini.business.Employee;


public interface EmployeeDAO {
	boolean addEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean removeEmployee(int emp_id);
	List<Employee> getallEmployess();
	Employee findEmployee(int emp_id);

}
