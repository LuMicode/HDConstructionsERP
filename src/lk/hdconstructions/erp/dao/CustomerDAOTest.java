package lk.hdconstructions.erp.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import lk.hdconstructions.erp.models.Customer;

public class CustomerDAOTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer("982264022V", "Mr",  "Malik", "Perera", "goodword", "123, bubmble bee", "+94772506467");
	
		try {
		CustomerDAO.addNewCustomer(customer);
		
		customer.setTelephone("+94772345467");
		CustomerDAO.updateCustomer(customer);
		
		
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			ArrayList<Customer> customers = CustomerDAO.getAllCustomers();
//			
//			for(Customer customer: customers) {
//				System.out.println(customer.getName()+": "+customer.getAddress());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}
	
}
