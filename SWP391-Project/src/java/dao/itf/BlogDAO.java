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
import static java.util.Collections.list;
import java.util.List;



/**
 *
 * @author phong
 */
public interface BlogDAO {
   

    void closeConnection() throws SQLException;
    
    public ArrayList<Blog> getAllBlog() throws Exception ;
    public List<Blog> getFirstFive() throws Exception ;
     public List<Blog> getPaging(int index) throws Exception;
        
}
