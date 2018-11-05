/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.hdconstructions.erp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.hdconstructions.erp.utils.DBConnection;

/**
 *
 * @author nandunbandara
 */
public class UserDAO {
    
    public boolean CheckUserNameAndPassword(String Un, String Pass) throws SQLException, ClassNotFoundException{
        
        
        
 
        String sql = "";
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stmt = null;
        
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String UserName = "";
            String Password = "";
            
            while (rs.next()){
                   return true;
            }
            
        } catch (Exception e) {
        }finally{
            conn.close();
            stmt.close();
        }
        
        
        return false;
    } 
    
}
