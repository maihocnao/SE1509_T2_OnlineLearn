/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        Mai           First Version<br>
 */
package dao.impl;
import dao.BlogDAO;
import bean.*;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GetBlogHP extends DBContext implements BlogDAO {
   
    
    /**
     * Get a 2 post from db to view
     *
     * @return an arraylist of post
     * @throws Exception
     */
    @Override
    public ArrayList<Blog> get2Post() throws Exception{
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
       
        ArrayList<Blog> arr = new ArrayList<>();
        String sql ="select top 2 [blogID],[userID],[categoryID],[thumbnail],[title],[updatedDate],[blogContent],[flag],[status]  FROM [SWP].[dbo].[Blog]";
    //  int blogID, int userID, String fullname, int categoryID, String thumbnail, String title, String updatedDate, String blogDetail, byte flag, byte status
        
         try { 
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            //statement.setString(1, sID);
            rs = statement.executeQuery();
            while(rs.next()) {
               int blogID = rs.getInt(1);
                int userID = rs.getInt(2);
                int categoryID = rs.getInt(3);
                String thumbnail = rs.getString(4);
                String title = rs.getString(5);
                String updatedDate = rs.getString(6);
                String blogContent = rs.getString(7);
                byte flag = rs.getByte(8);
                String status = rs.getString(9);
                Blog blog = new Blog(blogID, userID, categoryID, thumbnail, title, updatedDate, blogContent, flag, status);
                arr.add(blog);
             }
            
           System.out.println(arr);
         return arr;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        
    }
    


    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> getAllBlog() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
      
        GetBlogHP a = new GetBlogHP();
        try {
            a.get2Post();
        } catch (Exception ex) {
            Logger.getLogger(GetBlogHP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Blog findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateBlog(Blog blog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
