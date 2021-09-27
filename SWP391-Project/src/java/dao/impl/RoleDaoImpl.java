/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Role;
import dao.itf.BaseDao;
import dao.itf.RoleDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class RoleDaoImpl extends BaseDao implements RoleDAO {

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role findById(String id) {
        String sql = "SELECT * FROM dbo.[Role]"
                + " WHERE roleID = ?";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                Role role = new Role();
                role.setRoleID(id);
                role.setRoleName(rs.getString("roleName"));
                role.setRoleDescription(rs.getString("roleDescription"));
                return role;
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
    public List<Role> getRoleDesList() {
        String sql = "SELECT * FROM dbo.[Role]";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Role> data = new ArrayList<>();
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Role role = new Role();
                role.setRoleID(rs.getString("roleID"));
                role.setRoleDescription(rs.getString("roleDescription"));
                role.setRoleName(rs.getString("roleName"));
                data.add(role);
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
        return data;
    }

}
