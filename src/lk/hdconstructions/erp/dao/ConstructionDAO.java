package lk.hdconstructions.erp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import lk.hdconstructions.erp.models.Construction;
import lk.hdconstructions.erp.models.Customer;
import lk.hdconstructions.erp.utils.DBConnection;
import lk.hdconstructions.erp.utils.constants.QueryConstants;

public class ConstructionDAO {
	
	public static boolean addNewConstruction(Construction construction) throws ClassNotFoundException, SQLException{
		
		PreparedStatement addConstructionQuery = null;
		
		Connection conn;

		conn = DBConnection.getInstance().getConnection();

		try {
					
			addConstructionQuery = conn.prepareStatement(QueryConstants.ADD_NEW_CONSTRUCTION);
			addConstructionQuery.setInt(1, construction.getCid());
			addConstructionQuery.setString(2, construction.getName());
			addConstructionQuery.setString(3, construction.getAddress());
			addConstructionQuery.setString(4, construction.getConstructionJob());
			addConstructionQuery.setString(5, construction.getDescription());
			
			addConstructionQuery.executeUpdate();
			conn.commit();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}
						
		} finally {
			
			if (addConstructionQuery != null) {
				addConstructionQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
			
		return false;
	}
	
	public static ArrayList<Construction> getAllConstructions() throws ClassNotFoundException, SQLException {
		
		ArrayList<Construction> constructions = new ArrayList<Construction>();
		Statement stmt = null;
		
		Connection conn = DBConnection.getInstance().getConnection();
		
		
		stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery(QueryConstants.GET_ALL_CONSTRUCTIONS);
		
		while(results.next()) {
			
			Construction construction = new Construction(
					results.getInt("cid"),
					results.getString("name"),
					results.getString("address"),
					results.getString("constructionJob"),
					results.getString("description")
					);
			constructions.add(construction);
			
		}
		
		return constructions;
	}

	public static boolean deleteConstruction(int cid) throws ClassNotFoundException, SQLException{
		
		PreparedStatement deleteConstructionQuery = null;
		
		Connection conn = DBConnection.getInstance().getConnection();
		
		try {  
			deleteConstructionQuery = conn.prepareStatement(QueryConstants.DELETE_CONSTRUCTION);
			deleteConstructionQuery.setInt(1, cid);
			
			int rows = deleteConstructionQuery.executeUpdate();
			System.out.println("Rows affected: "+rows);
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				conn.rollback();
			}
						
		} finally {
			
			if (deleteConstructionQuery != null) {
				deleteConstructionQuery.close();
			}
			
			if(!conn.isClosed()) {
				DBConnection.getInstance().getConnection().close();
			}
			
		}
		
		return false;
	}


}

