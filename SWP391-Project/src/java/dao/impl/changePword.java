/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Slider;
import bean.Subject;
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

    @Override
    public boolean checkAccountExist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String xUserID, String xPassword) {
        String xSql = "update User set Password = ? where UserID = ?";
        try {
            ps = conn.prepareStatement(xSql);
            ps.setString(1, xPassword);
            ps.setString(2, xUserID);
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
    public void resetPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
