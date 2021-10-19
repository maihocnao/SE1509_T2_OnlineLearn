/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.User;
import bean.UserDto;
import dao.MyDAO;
import dao.UserDAO;
import java.util.List;

/**
 *
 * @author asus
 */
public class ChangePword extends MyDAO implements UserDAO{

    @Override
    public User getUser(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String email, String password) {
        String xSql = "update [User] set Password = ? where Email = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, password);
            ps.setString(2, email);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAccountExist(String Email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetPassword(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        ChangePword c = new ChangePword();
        c.changePassword("ngvCustomer@2mail.com", "12345");
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
