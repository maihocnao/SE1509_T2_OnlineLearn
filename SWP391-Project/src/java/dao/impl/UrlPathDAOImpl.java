/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import context.DBContext;
import dao.UrlPathDAO;
import bean.UrlPath;
import bean.UrlPatternForRole;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public class UrlPathDAOImpl extends DBContext implements UrlPathDAO{

    @Override
    public ArrayList<UrlPath> urlList() throws Exception {
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
        
        ArrayList<UrlPath> arr = new ArrayList<>();//arraylist of urlPatternforrole
        
        //sql statement
        String sql="SELECT * from URL_List";
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            //execute statement
            rs = statement.executeQuery();
            while(rs.next()) {
                
                String urlPath = rs.getString("urlPath") ;
                String pageName = rs.getString("pageName");
                String pageDescription = rs.getString("pageDescription");
               
                UrlPath u = new UrlPath(urlPath, pageName, pageDescription);
                arr.add(u);
             }
         //return value of urlp array   
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
    public void updateUrlInfo(String uPath, String pName, String pDescrip) throws Exception {
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
       
        //sql statement
        String sql="update URL_List set pageName=? , pageDescription=? where urlPath=?";
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1,pName);
            statement.setString(2,pDescrip);
            statement.setString(3,uPath);
            //execute statement
            rs = statement.executeQuery();
            
         //return value of urlp array   
        
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
        UrlPathDAO a = new UrlPathDAOImpl();
        System.out.println(a.urlList());
    }
    
}
