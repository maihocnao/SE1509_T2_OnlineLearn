/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.User;
import context.DBConnect;
import dao.itf.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class UserDetails implements UserDAO{
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
    
    public boolean updateUser(User u) throws Exception {
        String sql = "UPDATE user SET email=?, gender=?,"
                + "fullname=?, phone=? WHERE userID=?";
        try {
            DBConnect db = new DBConnect();
            con = db.getConnection();
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, u.getEmail());
                ps.setString(2, u.getGender());
                ps.setString(3, u.getFullname());
                ps.setString(4, u.getPhone());
                ps.setInt(5, u.getUserID());

                ps.executeUpdate();
                return true;
            }
        } finally {
            closeConnection();
        }
        return false;
    }

    public ArrayList<User> getAllUsers() throws Exception {
        String sql = "select * from user";

        ArrayList<User> lst = new ArrayList<>();
        try {
            DBConnect db = new DBConnect();
            con = db.getConnection();
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int uid = rs.getInt("userID");
                    int sid = rs.getInt("settingID");
                    String rid = rs.getString("roleID");
                    String email = rs.getString("email");
                    String password = rs.getString("password");
                    String gender = rs.getString("gender");
                    String fullname = rs.getString("fullname");
                    String phone = rs.getString("phone");
                    
                    User user = new User(uid, sid, rid, email, password, gender, fullname, phone);

                    lst.add(user);
                }
            }
        } finally {
            closeConnection();
        }
        return lst;
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
    
}
