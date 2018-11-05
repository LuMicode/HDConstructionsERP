package lk.hdconstructions.erp.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection Connection = null;
		try {
			Connection = DBConnection.getInstance().getConnection();
			DBConnection.getInstance().closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
