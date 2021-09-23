/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Slider;
import bean.Subject;
import bean.User;
import dao.DBConnect;
import dao.itf.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class changePword implements UserDAO{

    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public changePword(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    public changePword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAccountExist(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String xEmail, String xPassword) {
        String xSql = "update User set Password = ? where Email = ?";
        try {
            ps = conn.prepareStatement(xSql);
            ps.setString(1, xPassword);
            ps.setString(2, xEmail);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetPassword(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
