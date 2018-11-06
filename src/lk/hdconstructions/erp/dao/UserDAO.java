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

import lk.hdconstructions.erp.models.User;
import lk.hdconstructions.erp.utils.DBConnection;
import lk.hdconstructions.erp.utils.constants.QueryConstants;

/**
 *
 * @author nandunbandara
 */
public class UserDAO {
    
    public static User GetUserByUserName(String Un) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        PreparedStatement getUserByUsernameQuery = null;
        User user = null;

        try {
            getUserByUsernameQuery = conn.prepareStatement(QueryConstants.GET_USER_BY_USERNAME);
            
            getUserByUsernameQuery.setString(1, Un);
            ResultSet rs = getUserByUsernameQuery.executeQuery();
            
            while (rs.next()){
                   user = new User(rs.getString("username"), rs.getString("passoword"));
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
        
        
        return user;
    } 
}
    
