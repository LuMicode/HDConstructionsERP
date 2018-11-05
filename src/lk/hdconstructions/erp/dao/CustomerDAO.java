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
			addCustomerQuery.setString(2,  customer.getTitle());
			addCustomerQuery.setString(3, customer.getFirstName());
			addCustomerQuery.setString(4, customer.getLastName());
			addCustomerQuery.setString(5, customer.getCompany());
			addCustomerQuery.setString(6, customer.getAddress());
			addCustomerQuery.setString(7, customer.getTelephone());
			
			
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
		
		
		try {
			
			stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(QueryConstants.GET_ALL_CUSTOMERS);
			
			while(results.next()) {
				
				Customer customer = new Customer(
						results.getString("nic"),
						results.getString("title"),
						results.getString("firstName"),
						results.getString("lastName"),
						results.getString("company"),
						results.getString("address"),
						results.getString("telephone")
						);
				customers.add(customer);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}	
					
		} finally {
			
			if(!stmt.isClosed()) {
				stmt.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
		return customers;
	}
	
	public static Customer getCustomerByNIC(String nic) throws ClassNotFoundException, SQLException {
		
		Customer customer  =  null;
		PreparedStatement getCustomerByNICQuery = null;
		
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			
			getCustomerByNICQuery = conn.prepareStatement(QueryConstants.GET_CUSTOMER_BY_NIC);
			getCustomerByNICQuery.setString(1, nic);
			ResultSet results = getCustomerByNICQuery.executeQuery();
			
			while(results.next()) {
				customer = new Customer(
							results.getString("nic"),
							results.getString("title"),
							results.getString("firstName"),
							results.getString("lastName"),
							results.getString("company"),
							results.getString("address"),
							results.getString("telephone")
						);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}	
			
		} finally {
			
			if(!getCustomerByNICQuery.isClosed()) {
				getCustomerByNICQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
		return customer;
	}
	
	// Update customer
	public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		PreparedStatement updateCustomerQuery = null;
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			
			updateCustomerQuery = conn.prepareStatement(QueryConstants.UPDATE_CUSTOMER);
			updateCustomerQuery.setString(1, customer.getTitle());
			updateCustomerQuery.setString(2, customer.getFirstName());
			updateCustomerQuery.setString(3,  customer.getLastName());
			updateCustomerQuery.setString(4,  customer.getCompany());
			updateCustomerQuery.setString(5, customer.getAddress());
			updateCustomerQuery.setString(6,  customer.getTelephone());
			updateCustomerQuery.setString(7, customer.getNIC());
			
			updateCustomerQuery.executeUpdate();
			conn.commit();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}	
			
		} finally {
			
			if(!updateCustomerQuery.isClosed()) {
				updateCustomerQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}

		return false;
	}
	
	//delete customer
	public static boolean deleteCustomer(int nic) throws ClassNotFoundException, SQLException {
		PreparedStatement deleteCustomerQuery = null;
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			deleteCustomerQuery = conn.prepareStatement(QueryConstants.DELETE_CUSTOMER);
			deleteCustomerQuery.setInt(1, nic);
			
			deleteCustomerQuery.executeUpdate();
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}
			
		} finally {
			
			if(!deleteCustomerQuery.isClosed()) {
				deleteCustomerQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
		return false;
	}
	
	
}

