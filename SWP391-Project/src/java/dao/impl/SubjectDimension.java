/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Category;
import bean.Registration;
import dao.CategoryDAO;
import dao.MyDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class SubjectDimension extends MyDAO implements CategoryDAO{

    @Override
    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> clist = new ArrayList<>();
        String sql = "select * from Category";
        try {
            if(con!=null){
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    int categoryid = rs.getInt("categoryID");
                    String type = rs.getString("type");
                    String categoryname = rs.getString("categoryName");
                    Category c = new Category(categoryid, type, categoryname);
                    clist.add(c);
                }
            }
        } catch (Exception e) {
        }
        return clist;
    }
    public static void main(String[] args) {
        SubjectDimension a = new SubjectDimension();
         ArrayList<Category> clist;
        try {
            clist = a.getAllCategories();  System.out.println(clist);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationsList.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void updateCategory(String type, String categoryName,int categoryID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
