/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.hdconstructions.erp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.hdconstructions.erp.utils.DBConnection;
import lk.hdconstructions.erp.utils.constants.QueryConstants;

/**
 *
 * @author nandunbandara
 */
public class UserDAO {
    
    public boolean CheckUserNameAndPassword(String Un, String Pass) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        PreparedStatement getUserByUsernameQuery = null;
        try {
            getUserByUsernameQuery = conn.prepareStatement(QueryConstants.GET_USER_BY_USERNAME);
            getUserByUsernameQuery.setString(1, Un);
            ResultSet rs = getUserByUsernameQuery.executeQuery();
            
            while (rs.next()){
                    // TODO: check password hash once password hash is implemented
                   if(rs.getString("username") == Un && rs.getString("password") == Pass){
                       return true;
                   }
            }
            
        } catch (Exception e) {
        }finally{
            
            if(!getUserByUsernameQuery.isClosed()){
                
                getUserByUsernameQuery.close();
                
            }
            
            if(!conn.isClosed()){
                DBConnection.getInstance().getConnection().close();
            }
            
            
        }
        
        
        return false;
    } 
    
}
