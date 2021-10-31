/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.Lesson;
import bean.UrlPatternForRole;
import context.DBContext;
import dao.UrlPatternDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Viettech88.vn
 */
public class UrlFilterDAOImpl extends DBContext implements UrlPatternDAO{

    @Override
    public ArrayList<UrlPatternForRole> allUrlRole() throws Exception {
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
        
        ArrayList<UrlPatternForRole> arr = new ArrayList<>();//arraylist of lesson
        
        //sql statement
        String sql="SELECT * from UrlPatternOfRole";
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            //execute statement
            rs = statement.executeQuery();
            while(rs.next()) {
                // id int IDENTITY(1,1) primary key,
// roleID int, 
// roleName nvarchar(50),
// urlPattern nvarchar(700),
// pageName n
                int id = rs.getInt("id");
                int roleID = rs.getInt("roleID");
                String roleName = rs.getString("roleName");
                String urlPattern = rs.getString("urlPattern");
                String pageName = rs.getString("pageName");
                UrlPatternForRole u = new UrlPatternForRole(id, roleID, roleName, urlPattern, pageName);
                arr.add(u);
             }
         //return value of lesson array   
         return arr;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }

    @Override
    public ArrayList<UrlPatternForRole> urlbyRole(String roleId) throws Exception {
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
        
        ArrayList<UrlPatternForRole> arr = new ArrayList<>();//arraylist of lesson
        
        //sql statement
        String sql="SELECT * from UrlPatternOfRole where roleID = ?";
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, roleId);
            //execute statement
            rs = statement.executeQuery();
            while(rs.next()) {
                // id int IDENTITY(1,1) primary key,
// roleID int, 
// roleName nvarchar(50),
// urlPattern nvarchar(700),
// pageName n
                int id = rs.getInt("id");
                int roleID = rs.getInt("roleID");
                String roleName = rs.getString("roleName");
                String urlPattern = rs.getString("urlPattern");
                String pageName = rs.getString("pageName");
                UrlPatternForRole u = new UrlPatternForRole(id, roleID, roleName, urlPattern, pageName);
                arr.add(u);
             }
         //return value of lesson array   
         return arr;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }
    public static void main(String[] args) throws Exception {
        UrlFilterDAOImpl a = new UrlFilterDAOImpl();
        System.out.println(a.urlbyRole("1"));
    }
    
}
