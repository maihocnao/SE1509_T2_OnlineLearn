/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.User;
import context.MSSQLConnection;
import static context.MSSQLConnection.getConnection;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class Login implements UserDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    /**
     *
     * @param email
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public User checkLogin(String email, String password) {
        User user = null;
        String sql = "select * FROM [SWP].[dbo].[User] where email=? AND password=?";
        
        try {
            con = MSSQLConnection.getConnection();
            ps = con.prepareStatement(sql) ; 
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
//            int UserID, int SettingID, String RoleID, String Email, String Password, String Gender, String Fullname, String Phone
            if (rs.next()) {
                return new User(rs.getInt("UserID"), rs.getInt("SettingID")
                ,rs.getString("RoleID"),rs.getString("Email"),rs.getString("Password")
                ,rs.getString("Gender"),rs.getString("Fullname"),rs.getString("Phone"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(con);
        }
        return user;
    }
    public static void main(String[] args) {
        Login login = new Login();
        login.checkLogin("admin@gmail.com","123") ; 
    }
    @Override
    public boolean checkAccountExist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String UserID, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
