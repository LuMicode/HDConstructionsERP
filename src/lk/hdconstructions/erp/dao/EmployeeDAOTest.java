package lk.hdconstructions.erp.dao;

import java.sql.SQLException;

import lk.hdconstructions.erp.models.Employee;

public class EmployeeDAOTest {
	public static void main(String[] args) {
//		Employee employee = new Employee("Mr",76878768,"Nandun", "Bandra", "8768764","goodworm");
//		
//		try {
//			EmployeeDAO.addNewEmployee(employee);
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			EmployeeDAO.deleteEmployee(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
}
