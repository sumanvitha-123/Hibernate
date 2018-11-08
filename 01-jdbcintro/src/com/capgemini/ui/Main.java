package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.business.Customer;
import com.capgemini.db.CustomerDAO;
import com.capgemini.db.CustomerDAOImpl;

public class Main {

	public static void add() throws ClassNotFoundException, SQLException {
		
		
		int inp_id=0;
		String inp_name=null;
		String inp_city=null;
		double inp_amt=0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the id : ");
		inp_id = scanner.nextInt();
		System.out.print("Enter Name:");
		inp_name = scanner.next();
		System.out.print("Enter the city : ");
		inp_city = scanner.next();
		System.out.print("Enter the outstanding amount");
		inp_amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(inp_id);
		customer.setName(inp_name);
		customer.setCity(inp_city);
		customer.setOutStandingAmount(inp_amt);
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.addCustomer(customer);
		if(result==true){
			System.out.println("successfully added");
			
		}
		else
		{
			System.out.println("Not added");
		}
		
	}
	public static void update() throws ClassNotFoundException, SQLException {
		
		int inp_id;
		String inp_name=null;
		String inp_city=null;
		double inp_amt=0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Name:");
		inp_name = scanner.next();
		System.out.print("Enter the city : ");
		inp_city = scanner.next();
		System.out.print("Enter the outstanding amount");
		inp_amt = scanner.nextDouble();
		System.out.print("Enter the id to modify: ");
		inp_id = scanner.nextInt();
		Customer customer = new Customer();
		customer.setId(inp_id);
		customer.setName(inp_name);
		customer.setCity(inp_city);
		customer.setOutStandingAmount(inp_amt);
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.updateCustomer(customer);
		if(result==true){
			System.out.println("successfully updated");
			
		}
		else
		{
			System.out.println("Not updated");
		}
		
	}
	public static void displayAll() throws ClassNotFoundException, SQLException {
		
		CustomerDAO dao = new CustomerDAOImpl();
		List<Customer> customerList = dao.getAllCustomers();
//		System.out.println(customerList);
		for(Customer customer : customerList)
		{
			System.out.print(customer.getId()+"\t");
			System.out.print(customer.getName()+"\t");
			System.out.print(customer.getCity()+"\t");
			System.out.println(customer.getOutStandingAmount());
		}
	
	}
	public static void remove() throws ClassNotFoundException, SQLException {
		
		int inp_id = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id to remove : ");
		inp_id = scanner.nextInt();
		
		
		
		CustomerDAO dao = new CustomerDAOImpl(); 
		boolean result = dao.removeCustomer(inp_id);
		if(result == true)
		{
			System.out.println("record deleted successfully");
		}
		else
		{
			System.out.println("not deleted");
		}
	
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Customer Application");
		System.out.println("-----------------------");
		System.out.println("1. Add New Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Display All Customers");
		System.out.println("4.Delete Customer");
		System.out.println("5.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1:
				add();
			
				break;
			case 2:
				update();
				break;
			case 3:
				displayAll();
				break;
			case 4:
				remove();
				break;
			case 5:System.out.println("Thank You");
	
				break;
			default:System.out.println("Enter the choice properly");
				
				break;
		}

		
	}

}
