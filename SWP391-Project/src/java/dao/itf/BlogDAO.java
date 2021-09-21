package dao.itf;

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



/**
 *
 * @author phong
 */
public interface BlogDAO {
   

    void closeConnection() throws SQLException;
    
    public ArrayList<Blog> getAllBlog() throws Exception ;
}
