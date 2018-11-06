/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.hdconstructions.erp.views.other;

import javax.swing.JFrame;
import lk.hdconstructions.erp.views.login.Login;

/**
 *
 * @author tharindu
 */
public class HDConstructions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Login login = new Login();
       login.setVisible(true);
       login.pack();
       login.setLocationRelativeTo(null);
       login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
       
       
    }
    
}
