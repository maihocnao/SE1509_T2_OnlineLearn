/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Blog;
import dao.BaseDao;
import dao.BlogDAO;
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
public class BlogDaoImpl extends BaseDao implements BlogDAO {

    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> getAllBlog() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Blog> get2Post() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Blog findById(String id) {
        try {
            String sql = "SELECT * FROM [dbo].[Blog]"
                    + " WHERE blogID = ? ";

            Connection con;
            con = getConnection();
            PreparedStatement stm;
            stm = con.prepareStatement(sql);
            int blogId;
            try {
                blogId = Integer.parseInt(id);
                int index = 0;
                stm.setInt(++index, blogId);
            } catch (NumberFormatException e) {
                return null;
            }
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Blog blog = new Blog();
                blog.setBlogID(rs.getInt("blogID"));
                blog.setUserID(rs.getInt("userID"));
                blog.setCategoryID(rs.getInt("categoryID"));
                blog.setThumbnail(rs.getString("thumbnail"));
                blog.setTitle(rs.getString("title"));
                blog.setUpdatedDate(rs.getString("updatedDate"));
                blog.setBlogContent(rs.getString("blogContent"));
                blog.setFlag(rs.getByte("flag"));
                blog.setStatus(rs.getString("status"));
                return blog;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BlogDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int updateBlog(Blog blog) {
        try {
            String sql = "UPDATE [dbo].[Blog]\n"
                    + " SET title = ? , blogContent = ? , updatedDate = ?\n"
                    + "WHERE blogID = ?";
            Connection con;
            PreparedStatement stm;
            con = getConnection();
            stm = con.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, blog.getTitle());
            stm.setString(++index, blog.getBlogContent());
            stm.setString(++index, blog.getUpdatedDate());
            stm.setInt(++index, blog.getBlogID());
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BlogDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
