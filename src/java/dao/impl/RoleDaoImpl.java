/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Role;
import dao.BaseDao;
import dao.RoleDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cyv2098
 */
public class RoleDaoImpl extends BaseDao implements RoleDAO {

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Role findById(String id) throws Exception{
        String sql = "SELECT * FROM dbo.[Role]"
                + " WHERE roleID = ?";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        Role role = new Role();
        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                
                role.setRoleID(id);
                role.setRoleName(rs.getString("roleName"));
                role.setRoleDescription(rs.getString("roleDescription"));
                
            }
            return role;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closeStatement(stm);
            closeConnection(conn);
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Role> getRoleDesList() throws Exception{
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
            throw  e;
        } finally {
            closeResultSet(rs);
            closeStatement(stm);
            closeConnection(conn);
        }
        return data;
    }
    

}
