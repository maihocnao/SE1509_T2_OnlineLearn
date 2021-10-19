/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.User;
import bean.UserDto;
import context.DBContext;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class ResetPassword extends DBContext implements UserDAO {
     
   
    
    public static void main(String[] args) {
      //  DBConnect db = new DBConnect();
       ResetPassword sss;
        sss = new ResetPassword();
        try {
            System.out.println(sss.checkAccountExist("ngdCustomer@2mail.com"));
        } catch (Exception ex) {
            Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    


     @Override
    public boolean checkAccountExist(String email) throws Exception{ //Kiểm tra tài khoản có tồn tại không qua Email
        String sql = "select * from [SWP].[dbo].[User] where Email=?";
        Connection conn = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = getConnection();
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            //rs = dbConn.getData(sql);
            return rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }finally{
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        
        
    }
    

    

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void changePassword( String password) throws Exception {// thay đổi mật khẩu tại nơi Password null
        String sql = "update User set Password = ? where password is null";
        Connection conn = null;
        PreparedStatement ps= null;
        try {
            conn = getConnection();
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, password);
            ps.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }finally{
            
            closePreparedStatement(ps);
            closeConnection(conn);
        }
      
    }


    public void resetPassword(String email) throws Exception{
        String sql = "update user set password = null where email=?";
        Connection conn = null;
        PreparedStatement ps= null;
        try {
            conn = getConnection();
            
            ps = conn.prepareStatement(sql);
            ps.setString(1,email );
            ps.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }finally{
            
            closePreparedStatement(ps);
            closeConnection(conn);
        }
}

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

    @Override
    public User getUserByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int createUser(User user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countExistedUser(User user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countUserWithCondition(String roleId, String gender, String status) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
}
