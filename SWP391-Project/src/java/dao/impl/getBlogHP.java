/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.*;

import dao.DBConnect;
import dao.itf.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public class getBlogHP implements SubjectDAO {
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public getBlogHP(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }
    
    
    ArrayList<Blog> get2Post(){
        ArrayList<Blog> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("select top 2  [blogID],[userID],[fullname],[categoryID],[thumbnail],[title],[updatedDate],[blogDetail],[flag],[status]  FROM [SWP].[dbo].[Blog]");
    //  int blogID, int userID, String fullname, int categoryID, String thumbnail, String title, String updatedDate, String blogDetail, byte flag, byte status
        try {
            while(rs.next()) {
                int blogID = rs.getInt(1);
                int userID = rs.getInt(2);
                String fullname = rs.getString(3);
                int categoryID = rs.getInt(4);
                String thumbnail = rs.getString(5);
                String title = rs.getString(6);
                String updatedDate = rs.getString(7);
                String blogDetail = rs.getString(8);
                byte flag = rs.getByte(9);
                byte status = rs.getByte(10);
                Blog blog = new Blog(blogID, userID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, flag, status);
                arr.add(blog);
                 
            }
        } catch (SQLException ex) {
            
        }
        System.out.println(arr);
 
        return arr;
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        DBConnect dBConnect = new DBConnect();
        getBlogHP g = new getBlogHP(dBConnect);
        g.get2Post();
    }
}
