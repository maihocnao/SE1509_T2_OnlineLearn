/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.User;
import bean.UserDto;
import dao.itf.BaseDao;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class Login extends BaseDao implements UserDAO {

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
        String sql = "select * FROM [dbo].[User] where email=? AND password=?";
        
        try {
            con = getConnection(); 
            ps = con.prepareStatement(sql) ; 
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery(); 
//            int UserID, int SettingID, String RoleID, String Email, String Password, String Gender, String Fullname, String Phone
            if (rs.next()) {
                user = new User();
                user.setUserID(rs.getInt("UserID"));
                user.setRoleID(rs.getString("RoleID"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("Gender"));
                user.setFullname(rs.getString("Fullname"));
                user.setPhone(rs.getString("Phone"));
                user.setEnabled(rs.getBoolean("enabled"));
                return user;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                closeResultSet(rs);
                closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
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

    @Override
    public void changePassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int createUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countExistedUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countUserWithCondition(String roleId, String gender, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
