/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.User;
import bean.UserDto;
import context.DBContext;
import dao.UserDAO ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Viettech88.vn
 */
public class Login extends DBContext implements UserDAO{
   
    /**
     *
     * @param email
     * @param password
     * @return
     * @throws java.lang.Exception
     */
    @Override
     public User checkLogin(String email, String password) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        User user = null;
        boolean check =false;
        String sql = "select * from [SWP].[dbo].[User] where Email=? AND Password=?";
        try {   conn = getConnection();
                statement = conn.prepareStatement(sql);
                statement.setString(1, email);
                statement.setString(2, password);
                rs = statement.executeQuery();
                if (rs.next()) {
                    int userID = rs.getInt(1);
                    String roleID = rs.getString("RoleID");                    
                    String uEmail = rs.getString("Email");
                    String upass = rs.getString("password");
                    String gender = rs.getString("Gender");
                    String fullname = rs.getString("Fullname");
                    String phone = rs.getString("Phone");
                    String status = rs.getString("status");
                    String image = rs.getString("image");
                   user = new User(userID, roleID, uEmail, upass, gender, fullname, phone, status,image);
                   
                }
            
        } catch (SQLException e) {
           throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return user ;
    }
        
    @Override
    public boolean checkAccountExist(String Email) {
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
    public void resetPassword(String email) {
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
