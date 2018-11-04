package lk.hdconstructions.erp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lk.hdconstructions.erp.models.Construction;
import lk.hdconstructions.erp.models.Customer;
import lk.hdconstructions.erp.utils.DBConnection;
import lk.hdconstructions.erp.utils.constants.QueryConstants;

public class CustomerDAO {
	/*
	 * Add new customer
	 * @Param: Customer object
	 */
	public static boolean addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException{
		
		PreparedStatement addCustomerQuery = null;
		
		Connection conn;

		conn = DBConnection.getInstance().getConnection();

		try {
					
			addCustomerQuery = conn.prepareStatement(QueryConstants.ADD_NEW_CUSTOMER);
			addCustomerQuery.setString(1, customer.getNIC());
			addCustomerQuery.setString(2, customer.getFirstName());
			addCustomerQuery.setString(3, customer.getLastName());
			addCustomerQuery.setString(4, customer.getCompany());
			addCustomerQuery.setString(5, customer.getAddress());
			addCustomerQuery.setString(6, customer.getTelephone());
			
			
			addCustomerQuery.executeUpdate();
			conn.commit();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}	
			
	
		}finally {
			
			if (addCustomerQuery != null) {
				addCustomerQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		 }
		
		return false;
	}
	
	public static ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Statement stmt = null;
		
		Connection conn = DBConnection.getInstance().getConnection();
		
		
		stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery(QueryConstants.GET_ALL_CUSTOMERS);
		
		while(results.next()) {
			
			Customer customer = new Customer(
					results.getString("nic"),
					results.getString("firstName"),
					results.getString("lastName"),
					results.getString("company"),
					results.getString("address"),
					results.getString("telephone")
					);
			customers.add(customer);
			
		}
		
		return customers;
	}
	
	public static Customer getCustomerByNIC(String nic) throws ClassNotFoundException, SQLException {
		
		Customer customer  =  null;
		PreparedStatement getCustomerByNICQuery = null;
		
		Connection conn = DBConnection.getInstance().getConnection();
		
		getCustomerByNICQuery = conn.prepareStatement(QueryConstants.GET_CUSTOMER_BY_NIC);
		getCustomerByNICQuery.setString(1, nic);
		ResultSet results = getCustomerByNICQuery.executeQuery();
		
		while(results.next()) {
			customer = new Customer(
						results.getString("nic"),
						results.getString("firstName"),
						results.getString("lastName"),
						results.getString("company"),
						results.getString("address"),
						results.getString("telephone")
					);
		}
		
		return customer;
	}
	
}

