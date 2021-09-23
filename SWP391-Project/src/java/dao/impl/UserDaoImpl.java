/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.itf.BaseDao;
import dao.itf.UserDAO;
import java.sql.SQLException;
import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class UserDaoImpl extends BaseDao implements UserDAO {

    @Override
    public boolean checkAccountExist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword() {
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
    public int createUser(User user) {
        String sql = "INSERT INTO dbo.[User](RoleID, SettingID,Email,Password,Gender,Fullname,Phone,enabled) VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        try {
            stm = conn.prepareCall(sql);
            int index = 0;
            stm.setString(++index, user.getRoleID());
            stm.setInt(++index, user.getSettingID());
            stm.setString(++index, user.getEmail());
            stm.setString(++index, user.getPassword());
            stm.setString(++index, user.getGender());
            stm.setString(++index, user.getFullname());
            stm.setString(++index, user.getPhone());
            stm.setBoolean(++index, user.isEnabled());
            return stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeConnection(conn);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }

    @Override
    public int countExistedUser(User user) {
        String sql = "SELECT count(*) AS total FROM dbo.[User]"
                + "WHERE email = ?";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        int total = -1;
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, user.getEmail());
            rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                closeConnection(conn);
                closeResultSet(rs);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return total;
    }
}
