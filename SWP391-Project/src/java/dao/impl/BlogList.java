/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Blog;
import dao.BlogStatus;
import dao.MyDAO;
import dao.itf.BlogDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class BlogList extends MyDAO implements BlogDAO {

    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> getAllBlog() {
    String sql = "Select * from [Blog]";
    ArrayList<Blog> AllBlog = new ArrayList<>();
     try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    // query information in db
                    Blog bl = new Blog();
//                    int blogID = rs.getInt("blogID");
//                    int userID = rs.getInt("userID");
//                    int categoryID = rs.getInt("categoryID");
//                    String thumbnail = rs.getString("thumbnail");
//                    String title = rs.getString("title");
//                    String updatedDate = rs.getString("updatedDate");
//                    String blogContent = rs.getString("blog content");
//                    byte flag = rs.getByte("flag");
//                    String status = rs.getString("status");
                    int blogID = rs.getInt(1);
                int userID = rs.getInt(2);
                String fullname = rs.getString(3);
                int categoryID = rs.getInt(4);
                String thumbnail = rs.getString(5);
                String title = rs.getString(6);
                String updatedDate = rs.getString(7);
                String blogDetail = rs.getString(8);
                boolean flag = rs.getBoolean(9);
                byte status = rs.getByte(10);
                Blog blog = new Blog(blogID, userID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, flag, status);
                AllBlog.add(blog);
                }
            }
        } catch (Exception e) {
         
        }
    return AllBlog;
    }

    @Override
    public List<Blog> getFirstFive() throws Exception {
 String sql = "select * from (select b.*, u.fullname from blog b, user u where u.userID = b.userID order by updatedDate desc) as T limit 5;";
        ArrayList<Blog> list = new ArrayList<>();

        try {
         
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) {
                    // query information in db
                    int blogID = rs.getInt("blogID");
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
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

//                    Blog blog = new Blog(blogID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);
//                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("getFirstFive :: " + e);
        } finally {
            closeConnection();
        }

        return list;    }

    @Override
    public List<Blog> getPaging(int index) throws Exception {
  String sql = "select * from (select b.*, u.fullname,  row_number() over (order by updatedDate desc) as r from blog b, user u where u.userID = b.userID) as x where r between (? * 9 - 8) and (? * 9)";
        ArrayList<Blog> list = new ArrayList<>();

        try {

            if (con != null) {
                ps = con.prepareStatement(sql);

                ps.setInt(1, index);
                ps.setInt(2, index);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
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

//                    Blog blog = new Blog(blogID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);
//                    list.add(blog);
                }
            }
        } catch (Exception e) {
            System.out.println("getPaging :: " + e);
        } finally {
            closeConnection();
        }
        return list;    }
      public List<Blog> getSearchList(String txt, int index) throws SQLException {
        String sql = "select * from (select b.*, u.fullname,  row_number() over (order by updatedDate desc) as r from blog b, user u where u.userID = b.userID and title like ?) as x where r between (?* 9 - 8) and (? * 9);";
        ArrayList<Blog> list = new ArrayList<>();

        try {
//            DBConnection db = new DBConnection();
//            con = db.getConnection();

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + txt + "%");
                ps.setInt(2, index);
                ps.setInt(3, index);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
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

//                    Blog blog = new Blog(blogID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);
//                    list.add(blog);
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
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, blogID);
                rs = ps.executeQuery();
                if (rs.next()) {
                    String fullname = rs.getString("fullname");
                    int categoryID = rs.getInt("categoryID");
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

//                    blog = new Blog(blogID, fullname, categoryID, thumbnail, title, updatedDate, blogDetail, blogFlag, blogStatus);
                }
            }
        } catch (Exception e) {
            System.out.println("getBlog :: " + e);
        } finally {
            closeConnection();
        }

        return blog;
    }
    public static void main(String[] args) {
        BlogList bl = new BlogList();

        System.out.println(bl.getAllBlog());
    }
  
   }
