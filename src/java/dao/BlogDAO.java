package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.Blog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;



/**
 *
 * @author phong
 */
public interface BlogDAO {
   

    void closeConnection() throws SQLException;
    /**
     * Get a User according to email
     *
     * @param no param
     * @return an arraylist of blog
     * @throws Exception
     */
    public ArrayList<Blog> getAllBlog() throws Exception ;
    public ArrayList<Blog> get2Post() throws Exception;
    public Blog findById(String id);
    public int updateBlog(Blog blog);
        
}
