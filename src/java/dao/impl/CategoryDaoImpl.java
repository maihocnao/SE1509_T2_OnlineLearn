/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Category;
import dao.BaseDao;
import dao.CategoryDAO;
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
public class CategoryDaoImpl extends BaseDao implements CategoryDAO{

    @Override
    public List<Category> getAll() {
        List<Category> result = new ArrayList<>();
        try {
            String sql = "SELECT * FROM [dbo].[Category]";
            Connection con = getConnection();
            PreparedStatement stm =con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Category cat = new Category();
                cat.setCategoryID(rs.getInt("categoryID"));
                cat.setType(rs.getString("type"));
                cat.setCategoryName(rs.getString("categoryName"));
                result.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }    
    return result;
    }
    
}
