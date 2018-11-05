package lk.hdconstructions.erp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lk.hdconstructions.erp.utils.constants.DBConstants;


/**
 *
 * @author Malith Bandara
 */
public class DBConnection {

	private Connection conn;
	private static DBConnection connectionInstance;
	
	private DBConnection() throws SQLException, ClassNotFoundException{
		conn = createConnection();
	}
	
	private Connection createConnection() throws SQLException, ClassNotFoundException {
		
		String username = DBConstants.DB_USERNAME;
		String password = DBConstants.DB_PASSWORD;
		String url = DBConstants.DB_URL;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(url, username, password);
		conn.setAutoCommit(false);
		
		return conn;
		
	}
	
	public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
		
		if(connectionInstance == null) {
			connectionInstance = new DBConnection();
		} else if (connectionInstance.getConnection().isClosed()) {
			connectionInstance = new DBConnection();
		}
		
		return connectionInstance;
		
	}
	
	public Connection getConnection() {
		try {
			System.out.println(conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeConnection() throws SQLException {
		conn.close();
	}
	
	
	
	
}
