package lk.hdconstructions.erp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
		
		if(connectionInstance == null) {
			connectionInstance = new DBConnection();
		} else if (connectionInstance.getConnection().isClosed()) {
			connectionInstance = new DBConnection();
		}
		
		return connectionInstance;
		
	}
	
	private Connection createConnection() throws SQLException, ClassNotFoundException {
		
		String username = Constants.DB_USERNAME;
		String password = Constants.DB_PASSWORD;
		String url = Constants.DB_URL;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
		
	}
}
