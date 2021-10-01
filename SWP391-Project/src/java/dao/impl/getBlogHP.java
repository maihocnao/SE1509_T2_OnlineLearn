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
import dao.itf.SubjectDAO;
import bean.*;

import dao.DBConnect;
import dao.itf.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GetBlogHP implements BlogDAO {
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public GetBlogHP(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }
    
    /**
     * Get a 2 post from db to view
     *
     * @return an arraylist of post
     * @throws Exception
     */
    public ArrayList<Blog> get2Post() {
        ArrayList<Blog> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("select top 2 [blogID],[userID],[categoryID],[thumbnail],[title],[updatedDate],[blogContent],[flag],[status]\n" +
"  FROM [SWP].[dbo].[Blog]");
    //  int blogID, int userID, String fullname, int categoryID, String thumbnail, String title, String updatedDate, String blogDetail, byte flag, byte status
        try {
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
        } catch (SQLException ex) {
            
        }
        
 
        return arr;
    }


    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> getAllBlog() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
