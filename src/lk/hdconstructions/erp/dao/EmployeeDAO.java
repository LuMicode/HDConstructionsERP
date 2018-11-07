package lk.hdconstructions.erp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lk.hdconstructions.erp.models.Customer;
import lk.hdconstructions.erp.models.Employee;
import lk.hdconstructions.erp.utils.DBConnection;
import lk.hdconstructions.erp.utils.constants.QueryConstants;

public class EmployeeDAO {
	
	//Add Employee
	public static boolean addNewEmployee(Employee employee) throws ClassNotFoundException, SQLException{
			
		PreparedStatement addEmployeeQuery = null;
		Connection conn;
		
		conn = DBConnection.getInstance().getConnection();	
		
		try {
			
			addEmployeeQuery = conn.prepareStatement(QueryConstants.ADD_NEW_EMPLOYEE);
			addEmployeeQuery.setString(1, employee.getEmpTitle());
			addEmployeeQuery.setString(2, employee.getEmpNic());
			addEmployeeQuery.setString(3, employee.getFirstName());
			addEmployeeQuery.setString(4, employee.getLastName());
			addEmployeeQuery.setString(5, employee.getTelephone());
			addEmployeeQuery.setString(6, employee.getAddress());
			
			
			addEmployeeQuery.executeUpdate();
			conn.commit();
			
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
		}
			if(!conn.isClosed()) {

				DBConnection.getInstance().getConnection().close();
			
			}
			
		}
		return false;
	}
	
	//Get employee details by employee nic
	public static ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Statement stmt = null;
                
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			stmt = conn.createStatement();
                        ResultSet results = stmt.executeQuery(QueryConstants.GET_ALL_EMPLOYEE);
			
			while(results.next()) {
			Employee employee = new Employee(
							results.getString("empTitle"),
							results.getString("empId"),
							results.getString("firstName"),
							results.getString("lastName"),
							results.getString("address"),
							results.getString("telephone")
						);
                        employees.add(employee);
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
		
		return employees;
	}
	
	//update employee details
	public static boolean updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		
		PreparedStatement updateEmployeeQuery = null;
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			
			updateEmployeeQuery = conn.prepareStatement(QueryConstants.UPDATE_EMPLOYEE);
			updateEmployeeQuery.setString(1, employee.getEmpTitle());
			updateEmployeeQuery.setString(2, employee.getFirstName());
			updateEmployeeQuery.setString(3, employee.getLastName());
			updateEmployeeQuery.setString(4, employee.getAddress());
			updateEmployeeQuery.setString(5, employee.getTelephone());
			updateEmployeeQuery.setString(6, employee.getEmpNic());
			
			updateEmployeeQuery.executeUpdate();
			conn.commit();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}	
			
		} finally {
			
			if(!updateEmployeeQuery.isClosed()) {
				updateEmployeeQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}

		return false;
	}
	
	//delete employee
	public static boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		PreparedStatement deleteEmployeeQuery = null;
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {
			deleteEmployeeQuery = conn.prepareStatement(QueryConstants.DELETE_EMPLOYEE);
			deleteEmployeeQuery.setInt(1, empId);
			
			deleteEmployeeQuery.execute();
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}
			
		} finally {
			
			if(!deleteEmployeeQuery.isClosed()) {
				deleteEmployeeQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
		return false;
	}
	
	
	
}





