/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;
import bean.User;
import dao.DBConnect;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class resetPword implements UserDAO {
     Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;
    ResultSet rs;
    public resetPword(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    public resetPword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 /*
 * The class contains method select data from database
 * Staff table in database. In the update or insert method, all data will be normalized (trim space) before update/insert into database
 * The method wil throw an object  of <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data
 * @author Hoanganh
 */

     @Override
    public boolean checkAccountExist(String email) { //Kiểm tra tài khoản có tồn tại không qua Email
        String sql = "select User from user where email=?";
        try {
            DBConnect db = new DBConnect();        
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        return false;    
    }
    

    

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void changePassword( String Password) {// thay đổi mật khẩu tại nơi Password null
    String xSql = "update User set Password = ? where password is null";
        try {
            ps = conn.prepareStatement(xSql);
            ps.setString(1, Password);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {    
        }        
    }
 /*
 * The class contains method update data from database
 * Staff table in database. In the update or insert method, all data will be normalized (trim space) before update/insert into database
 * The method wil throw an object  of <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data
 * @author Hoanganh
 */

    public void resetPassword(String Email) {
 try {
            DBConnect db = new DBConnect();
            ps = conn.prepareStatement("update user set password = null where email=?");
            ps.setString(1, Email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void changePassword(String UserID, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        resetPword a = new resetPword(dbconn);
        a.resetPassword("");
 }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
