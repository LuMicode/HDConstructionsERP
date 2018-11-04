package lk.hdconstructions.erp.utils.constants;

public class QueryConstants {
	
	
	// Construction
	public static final String ADD_NEW_CONSTRUCTION = "INSERT INTO construction(nic, projectName, price, address)"
			+ " VALUES(?, ?, ?, ?)";
	public static final String GET_ALL_CONSTRUCTIONS = "SELECT * FROM construction";
	public static final String DELETE_CONSTRUCTION = "DELETE construction where cid = ?";
	
	
	// Customer
	public static final String ADD_NEW_CUSTOMER = "Insert into customer(nic, firstName, lastName, company, address, telephone)" + "VALUES(?, ?, ?, ?, ?, ?)";
	public static final String GET_ALL_CUSTOMERS = "SELECT * from customer";
	public static final String GET_CUSTOMER_BY_NIC = "SELECT * FROM customer WHERE nic = ?";
}
	
	
	


