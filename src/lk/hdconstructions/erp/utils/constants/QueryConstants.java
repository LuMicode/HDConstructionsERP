package lk.hdconstructions.erp.utils.constants;

public class QueryConstants {
	
	
	// Construction
	public static final String ADD_NEW_CONSTRUCTION = "INSERT INTO construction(nic, projectName, price, address)"
			+ " VALUES(?, ?, ?, ?)";
	public static final String GET_ALL_CONSTRUCTIONS = "SELECT * FROM construction";
	public static final String DELETE_CONSTRUCTION = "DELETE from construction where cid = ?";
	public static final String UPDATE_CONSTRUCTION  = "UPDATE construction SET"
													+ "projectName = ?,price = ?,address = ?"
													+ "where projectId = ?";
	
	// Customer
	public static final String ADD_NEW_CUSTOMER = "Insert into customer(nic, title, firstName, lastName, company, address, telephone)" + "VALUES(?, ?, ?, ?, ?, ?, ?)";
	public static final String GET_ALL_CUSTOMERS = "SELECT * from customer";
	public static final String GET_CUSTOMER_BY_NIC = "SELECT * FROM customer WHERE nic = ?";
	public static final String UPDATE_CUSTOMER = "UPDATE customer SET "
												+ "title = ?, firstName = ?, lastName = ?, company = ?, address = ?, telephone = ? "
												+ "WHERE nic = ?";
	public static final String DELETE_CUSTOMER = "DELETE from customer where nic = ?";
	//Employee
	public static final String ADD_NEW_EMPLOYEE = "Insert into employee(empTitle, empNic, firstName, lastName, telephone, address)" + "Values(?, ?, ?, ?, ?, ?)" ;
	public static final String GET_EMPLOYEE_BY_NIC = "SELECT * from employee WHERE empNic = ?";
	public static final String UPDATE_EMPLOYEE = "UPDATE employee SET "
												+ "empTitle = ?, firstName = ?, lastName =?, telephone =?, address =?"
												+ "WHERE empNic = ?";
	public static final String DELETE_EMPLOYEE = "DELETE from employee where empId = ?";
	
}
	

