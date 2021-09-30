/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.User;
import dao.MyDAO;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class resetPword extends MyDAO implements UserDAO {
 

    public resetPword() {
       
    }


     @Override
    public boolean checkAccountExist(String email) { //Kiểm tra tài khoản có tồn tại không qua Email
        String sql = "select [User] from user where email=?";
        try {
            ps = con.prepareStatement(sql);
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
            ps = con.prepareStatement(xSql);
            ps.setString(1, Password);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {    
        }        
    }


     @Override
    public void resetPassword(String Email) {
        String xSql ="update [User] set password = null where Email= ?";
 try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, Email);
            ps.executeUpdate();
             ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void changePassword(String UserID, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void main(String[] args) {
//        resetPword rsp = new resetPword();
//        rsp.resetPassword("trtCustomer@2mail.com");
//    }
   
    
    
}
