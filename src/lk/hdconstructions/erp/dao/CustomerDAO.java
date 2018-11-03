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
			addCustomerQuery.setInt(1, customer.getID());
			addCustomerQuery.setString(2, customer.getName());
			addCustomerQuery.setString(3, customer.getAddress());
			addCustomerQuery.setInt(4, customer.getTel());
			addCustomerQuery.setString(5, customer.getDescription());
			
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
					results.getInt("cusid"),
					results.getString("name"),
					results.getString("address"),
					results.getInt("tel"),
					results.getString("description")
					);
			customers.add(customer);
			
		}
		
		return customers;
	}
	
}

