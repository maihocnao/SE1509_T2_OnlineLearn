/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import dao.DBConnect;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Admin
 */
public class resetPword implements UserDAO {
     Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public resetPword(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    @Override
<<<<<<< HEAD
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
=======
    public boolean checkAccountExist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 7e8e6326fba4a5f060df0a1d2651985664606acd
    }

    

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

<<<<<<< HEAD

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

=======
>>>>>>> 7e8e6326fba4a5f060df0a1d2651985664606acd
    @Override
    public void resetPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String UserID, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
<<<<<<< HEAD
 public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        resetPword a = new resetPword(dbconn);
        a.resetPassword("");
 }
=======
>>>>>>> 7e8e6326fba4a5f060df0a1d2651985664606acd
    
}
