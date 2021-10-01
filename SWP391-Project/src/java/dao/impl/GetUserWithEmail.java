/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.User;
import context.DBConnect;
import dao.itf.UserDAO ;
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
public class GetUserWithEmail extends DBConnect implements  UserDAO{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    private void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }
    
     @Override
    public User getUserByEmail(String email) {
         User user = null;
        boolean check =false;
        String sql = "select * from [SWP].[dbo].[User] where Email=?";
        try {
            DBConnect db = new DBConnect();
            con = db.getConnection();
            if (con != null) {
              
                ps = con.prepareStatement(sql);
                ps.setString(1, email);
                rs = ps.executeQuery();
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
            }
        } catch (Exception e) {
            System.out.println("failed ne");
            e.printStackTrace();
        } finally {
            try {
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user ;
    }
   
    /**
     *
     * @param email
     * @param password
     * @return
     * @throws Exception
     */
   

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
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
