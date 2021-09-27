/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Blog;
import dao.BlogStatus;
import context.DBConnect;
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
    public List<Blog> getFirstFive() throws Exception { // Get 5 first Blog from Blog List
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
                    boolean flag = rs.getBoolean("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = true;
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
    
public int getCountSearch(String txt) throws Exception {
        String sql = "select count(*) as total from blog where title like ?";

        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt("total");
            }
        } catch (Exception e) {
            System.out.println("getCountSearch :: " + e);
        } finally {
            closeConnection();
        }
        return 0;
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
                    boolean flag = rs.getBoolean("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = true;
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
 public List<Blog> getSearchList(String txt, int index) throws SQLException { //Tim kiem trong list cac Blog
        String sql = "select * from (select b.*, u.fullname,  row_number() over (order by updatedDate desc) as r from blog b, user u where u.userID = b.userID and title like ?) as x where r between (?* 9 - 8) and (? * 9);";
        ArrayList<Blog> list = new ArrayList<>();
        try {
            DBConnect db = new DBConnect();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + txt + "%");
                ps.setInt(2, index);
                ps.setInt(3, index);
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
                    boolean flag = rs.getBoolean("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = true;
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
   public Blog getBlog(int blogID) throws Exception {
        String sql = "SELECT b.*, u.fullname FROM Blog b, User u where blogID=? and u.userID = b.userID;";
        Blog blog = null;

        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, blogID);
                rs = ps.executeQuery();
                if (rs.next()) {
                      int userID = rs.getInt("userID");
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
                    String thumbnail = rs.getString("thumbnail");
                    String title = rs.getString("title");
                    String updatedDate = rs.getString("updatedDate");
                    String blogDetail = rs.getString("blogDetail");
                    boolean flag = rs.getBoolean("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = true;
                    // convert status type to enum
                    if (status == 1) {
                        blogStatus = BlogStatus.PUBLISH;
                    } else {
                        blogStatus = BlogStatus.DRAFT;
                    }

                    blog = new Blog( blogID, userID, fullname, categoryID, thumbnail,  title,  updatedDate,  blogDetail,  flag,  status);
                }
            }
        } catch (Exception e) {
            System.out.println("getBlog :: " + e);
        } finally {
            closeConnection();
        }
        return blog;
                
   }
   
    public List<Blog> searchByCat(int categoryID) {
        String sql = "SELECT b.*, u.fullname FROM Blog b, User u where categoryID=? and u.userID = b.userID;";
        List<Blog> list = new ArrayList<>();

        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, categoryID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    int userID = rs.getInt("userID");
                    String fullname = rs.getString("fullname");
                    String thumbnail = rs.getString("thumbnail");
                    String title = rs.getString("title");
                    String updatedDate = rs.getString("updatedDate");
                    String blogDetail = rs.getString("blogDetail");
                    int flag = rs.getByte("flag");
                    byte status = rs.getByte("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = (flag == 1);
                    // convert status type to enum
                    if (status == 1) {
                        blogStatus = BlogStatus.PUBLISH;
                    } else {
                        blogStatus = BlogStatus.DRAFT;
                    }

            Blog blog = new Blog(blogID,userID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("searchByCat :: " + e);
        }
        return list;
    }
     public List<Blog> searchByCatPaging(int catID, int index) {
        String sql = "select * from (select b.*, u.fullname,  row_number() over (order by updatedDate desc) as r from blog b, user u where u.userID = b.userID and categoryID=?) as x where r between (?* 9 - 8) and (? * 9);";
        List<Blog> list = new ArrayList<>();

        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, catID);
                ps.setInt(2, index);
                ps.setInt(3, index);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    int userID = rs.getInt("userID");
                    String fullname = rs.getString("fullname");
                    String thumbnail = rs.getString("thumbnail");
                    String title = rs.getString("title");
                    String updatedDate = rs.getString("updatedDate");
                    String blogDetail = rs.getString("blogDetail");
                    int flag = rs.getInt("flag");
                    int status = rs.getInt("status");
                    BlogStatus blogStatus;
                    boolean blogFlag = (flag == 1);
                    // convert status type to enum
                    if (status == 1) {
                        blogStatus = BlogStatus.PUBLISH;
                    } else {
                        blogStatus = BlogStatus.DRAFT;
                    }

                    Blog blog = new Blog(blogID,userID, fullname, catID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);
                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("searchByCat :: " + e);
        }
        return list;
    }
  public boolean AddPost(int userID, int catID, String thumbnail, String title, String date, String detail, boolean flag, boolean status) throws SQLException {
        boolean result = false;
        String sql = "insert into blog(userID, categoryID, thumbnail,title, updatedDate, blogDetail, flag, status ) values ( ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, userID);
                ps.setInt(2, catID);
                ps.setString(3, thumbnail);
                ps.setString(4, title);
                ps.setString(5, date);
                ps.setString(6, detail);
                ps.setBoolean(7, flag);
                ps.setBoolean(8, status);
                ps.executeUpdate();
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean updatePostInfo(int userID, int catID, String thumbnail, String title, String date, String detail, boolean flag, boolean status) throws SQLException {
        boolean rs = false;
        String sql = "update blog set userID=?, catergoryID=?, thumbnail=?, title=?, date=?, detail=?,flag=?, status=?    where blogID=?;";
        try {
            DBConnect db = new DBConnect();
            conn = db.getConnection();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, userID);
                ps.setInt(2, catID);
                ps.setString(3, thumbnail);
                ps.setString(4, title);
                ps.setString(5, date);
                ps.setString(6, detail);
                ps.setBoolean(7, flag);
                ps.setBoolean(8, status);
                ps.executeUpdate();
                rs = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return rs;
    }
}
