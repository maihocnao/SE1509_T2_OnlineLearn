/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Category;
import dao.CategoryDAO;
import dao.MyDAO;
import java.util.ArrayList;


/**
 *
 * @author asus
 */
public class UpdateDimension extends MyDAO implements CategoryDAO{

    @Override
    public ArrayList<Category> getAllCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCategory(String type, String categoryName, int categoryID) {
        String sql = "update [Category] set [type] = ? ,categoryName = ? where categoryID = ?";
        try {
            if(con!= null){
                ps = con.prepareStatement(sql);
                ps.setString(1, type);
                ps.setString(2, categoryName);
                ps.setInt(3, categoryID);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    @Override
    public Category getCategoryById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategory(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCategory(String type, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
