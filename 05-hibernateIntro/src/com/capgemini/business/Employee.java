package com.capgemini.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="emp")
public class Employee {

	@Id
	@Column(name="emp_id")
	private int emp_id;
	
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="emp_basic")
	private double basic_salary;

	@Column(name="emp_Gender")
	private char emp_Gender;

	@Column(name="emp_Grade")
	private char emp_Grade;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}
	public char getEmp_Gender() {
		return emp_Gender;
	}
	public void setEmp_Gender(char emp_Gender) {
		this.emp_Gender = emp_Gender;
	}
	public char getEmp_Grade() {
		return emp_Grade;
	}
	public void setEmp_Grade(char emp_Grade) {
		this.emp_Grade = emp_Grade;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name
				+ ", basic_salary=" + basic_salary + ", emp_Gender="
				+ emp_Gender + ", emp_Grade=" + emp_Grade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emp_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_id != other.emp_id)
			return false;
		return true;
	}

	
}
