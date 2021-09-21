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
import java.sql.Connection;
import util.DBConnection;

package dao;

/**
 *
 * @author phong
 */
public interface BlogDAOitf {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    private void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }
    
    public ArrayList<Blog> getAllBlog() throws Exception {
    String sql = "SELECT * FROM Blog";
    ArrayList<Blog> list = new ArrayList<>();
    DBConnection db = new DBConnection();
    con = db.getConnection();
    if (con != null) {
                    
    }
    return null;
}
