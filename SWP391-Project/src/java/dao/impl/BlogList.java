/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Blog;
import dao.BlogStatus;
import dao.DBConnect;
import dao.itf.BlogDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class BlogList implements BlogDAO {
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;
    private ResultSet rs;
    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> getAllBlog() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Blog> getFirstFive() throws Exception {
 String sql = "select * from (select b.*, u.fullname from blog b, user u where u.userID = b.userID order by updatedDate desc) as T limit 5;";
        ArrayList<Blog> list = new ArrayList<>();  
       try {
            DBConnect db = new DBConnect();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) {
                    // query information in db
                    int blogID = rs.getInt("blogID");
                    int userID = rs.getInt("userID");
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
                    String thumbnail = rs.getString("thumbnail");
                    String title = rs.getString("title");
                    String updatedDate = rs.getString("updatedDate");
                    String blogDetail = rs.getString("blogDetail");
                    byte flag = rs.getByte("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = (flag == 1);
                    // convert status type to enum
                    if (status == 1) {
                        blogStatus = BlogStatus.PUBLISH;
                    } else {
                        blogStatus = BlogStatus.DRAFT;
                    }

                    Blog blog = new Blog( blogID, userID, fullname, categoryID, thumbnail,  title,  updatedDate,  blogDetail,  flag,  status);
                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("getFirstFive :: " + e);
        } finally {
            closeConnection();
        }

        return list;
    
    }

    @Override
    public List<Blog> getPaging(int index) throws Exception {
        String sql = "select * from (select b.*, u.fullname,  row_number() over (order by updatedDate desc) as r from blog b, user u where u.userID = b.userID) as x where r between (? * 9 - 8) and (? * 9)";
        ArrayList<Blog> list = new ArrayList<>();
        try {
            DBConnect db = new DBConnect();
            if (conn != null) {
                ps = conn.prepareStatement(sql);

                ps.setInt(1, index);
                ps.setInt(2, index);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    int userID = rs.getInt("userID");                   
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
                    String thumbnail = rs.getString("thumbnail");
                    String title = rs.getString("title");
                    String updatedDate = rs.getString("updatedDate");
                    String blogDetail = rs.getString("blogDetail");
                    byte flag = rs.getByte("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = (flag == 1);
                    // convert status type to enum
                    if (status == 1) {
                        blogStatus = BlogStatus.PUBLISH;
                    } else {
                        blogStatus = BlogStatus.DRAFT;
                    }
                    Blog blog = new Blog( blogID, userID, fullname, categoryID, thumbnail,  title,  updatedDate,  blogDetail,  flag,  status);
                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("getPaging :: " + e);
        } finally {
            closeConnection();
        }
        
        
        return list;
    }
    
     public int getTotal() throws SQLException {
        String sql = "select count(*) as total from blog;";

        try {
            DBConnect db = new DBConnect();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt("total");
            }
        } catch (Exception e) {
            System.out.println("getTotal :: " + e);
        } finally {
            closeConnection();
        }
        return 0;
    }
}
