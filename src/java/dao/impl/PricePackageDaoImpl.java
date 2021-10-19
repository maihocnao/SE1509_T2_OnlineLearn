/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.PricePackage;
import dao.BaseDao;
import dao.PricePackageDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class PricePackageDaoImpl extends BaseDao implements PricePackageDAO {

    @Override
    public ArrayList<PricePackage> getPPbySubjectID(String subjectID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PricePackage getOneById(int id) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "SELECT * FROM [dbo].[PricePackage]"
                    + " WHERE pricePackageID = ?";
            Connection conn = getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                PricePackage data = new PricePackage();
                data.setPricePackageID(rs.getInt("pricePackageID"));
                data.setPPname(rs.getString("name"));
                data.setAccessDuration(rs.getInt("accessDuration"));
                data.setStatus(rs.getString("status"));
                data.setListPrice(rs.getFloat("listPrice"));
                data.setSalePrice(rs.getFloat("salePrice"));
                data.setDescription(rs.getString("description"));
                return data;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PricePackageDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int insert(PricePackage data) {
        try {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "UPDATE [dbo].[PricePackage]"
                    + " SET name = ?, "
                    + " accessDuration = ?,"
                    + " status = ?,"
                    + " listPrice = ?,"
                    + " salePrice = ?,"
                    + " description = ?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, data.getPPname());
            stm.setInt(++index, data.getAccessDuration());
            stm.setString(++index, data.getStatus());
            stm.setFloat(++index, data.getListPrice());
            stm.setFloat(++index, data.getSalePrice());
            stm.setString(++index, data.getDescription());
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PricePackageDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
