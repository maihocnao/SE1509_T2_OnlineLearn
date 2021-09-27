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
import bean.UserDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.StringValidation;

/**
 *
 * @author cyv2098
 */
public class UserDaoImpl extends BaseDao implements UserDAO {

    private final Logger log = Logger.getLogger(UserDaoImpl.class.getName());

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

    @Override
    public User getUser(String email, String password) {
        String sql = "SELECT * FROM dbo.[User]"
                + "WHERE email = ? AND password = ? AND [enabled] = 'True' ";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, email);
            stm.setString(++index, password);
            rs = stm.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt("UserID"));
                user.setRoleID(rs.getString("RoleID"));
                user.setSettingID(rs.getInt("SettingID"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("Gender"));
                user.setFullname(rs.getString("Fullname"));
                user.setPhone(rs.getString("Phone"));
                user.setEnabled(true);
                user.setImageUrl(rs.getString("image_url"));
                return user;
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
        return null;
    }

    @Override
    public List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum) {
        StringValidation svl = new StringValidation();
        String sql = "SELECT *\n"
                + "FROM\n"
                + "  (SELECT ROW_NUMBER() OVER (\n"
                + "                             ORDER BY UserID) AS RowNum,\n"
                + "                            *\n"
                + "   FROM [dbo].[User]\n"
                + "WHERE 1 = 1\t";
        if (!svl.isNullOrEmpty(roleId)) {
            sql += "AND roleID = ? \t";
        }
        if (!svl.isNullOrEmpty(gender)) {
            sql += "AND gender = ? \t";
        }
        if (!svl.isNullOrEmpty(status)) {
            sql += "AND enabled = ?  \t";
        }
        sql += " ) AS T WHERE T.RowNum > ?\n"
                + "  AND T.RowNum <= ?\n";
        sql += "ORDER BY T.RowNum ";

        List<UserDto> data = new ArrayList<>();
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            if (!svl.isNullOrEmpty(roleId)) {
                stm.setString(++index, roleId);
            }
            if (!svl.isNullOrEmpty(gender)) {
                stm.setString(++index, gender);
            }
            if (!svl.isNullOrEmpty(status)) {
                stm.setBoolean(++index, Boolean.parseBoolean(status));
            }
            stm.setInt(++index, pageSize * (pageNum - 1));
            stm.setInt(++index, pageSize * (pageNum));
            log.info(roleId);
            log.info(gender);
            log.info(status);
            log.info(sql);
            rs = stm.executeQuery();
            RoleDaoImpl roleDao = new RoleDaoImpl();
            while (rs.next()) {
                UserDto user = new UserDto();
                user.setUserID(rs.getInt("UserID"));
                user.setRole(roleDao.findById(rs.getString("RoleID")).getRoleDescription());
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("Gender"));
                user.setFullname(rs.getString("Fullname"));
                user.setPhone(rs.getString("Phone"));
                user.setActive(rs.getBoolean("enabled") ? "Active" : "Deactive");
                data.add(user);
            }
            return data;
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
        return null;
    }

    @Override
    public int countUserWithCondition(String roleId, String gender, String status) {
        StringValidation svl = new StringValidation();
        String sql = "SELECT COUNT(*) AS TOTAL\t"
                + "FROM [dbo].[User]\t"
                + "WHERE 1 = 1\t";
        if (!svl.isNullOrEmpty(roleId)) {
            sql += "AND roleID = ? \t";
        }
        if (!svl.isNullOrEmpty(gender)) {
            sql += "AND gender = ? \t";
        }
        if (!svl.isNullOrEmpty(status)) {
            sql += "AND enabled = ? \t";
        }
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        int total = -1;
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            if (!svl.isNullOrEmpty(roleId)) {
                stm.setString(++index, roleId);
            }
            if (!svl.isNullOrEmpty(gender)) {
                stm.setString(++index, gender);
            }
            if (!svl.isNullOrEmpty(status)) {
                stm.setBoolean(++index, Boolean.parseBoolean(status));
            }
            log.info(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getInt("TOTAL");
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
