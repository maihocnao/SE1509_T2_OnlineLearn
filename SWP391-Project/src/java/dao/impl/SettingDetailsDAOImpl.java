/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.UrlPath;
import bean.Role;
import bean.UrlPatternForRole;
import dao.RoleDAO;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public class SettingDetailsDAOImpl extends DBContext implements RoleDAO{

    @Override
    public Role findById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Role> getRoleDesList() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Role> rolePermittedThisUrl(String urlPath) throws Exception{
        RoleDAO rdao = new  RoleDAOImpl();
        UrlFilterDAOImpl udao = new  UrlFilterDAOImpl();
        ArrayList<UrlPatternForRole> arUrl= udao.urlRoleUrl(urlPath) ;
        ArrayList<Role> arr = rdao.getRoleDesList();
        ArrayList<Role> arrs = new ArrayList<>();
        boolean checkExist;
       
        for(Role r: arr){
            
            checkExist = false;
            for(UrlPatternForRole u: arUrl){
                if(r.getRoleID().equals(String.valueOf(u.getRoleID()))){
                    checkExist = true;
                }
            }
            if(checkExist==false){
                arrs.add(r);
            }
        }

        
       
        return arrs;
    }
    
    public ArrayList<Role> roleThisUrl(String urlPath) throws Exception{
        RoleDAO rdao = new  RoleDAOImpl();
        UrlFilterDAOImpl udao = new  UrlFilterDAOImpl();
        ArrayList<UrlPatternForRole> arUrl= udao.urlRoleUrl(urlPath) ;
         ArrayList<Role> arrs = rdao.getRoleDesList();
       
        ArrayList<Role> arr =new ArrayList<>();
         boolean checkExist;
        
         for(Role r: arrs){
            
            checkExist = false;
            for(UrlPatternForRole u: arUrl){
                if(r.getRoleID().equals(String.valueOf(u.getRoleID()))){
                    checkExist = true;
                }
            }
            if(checkExist==true){
                arr.add(r);
            }
        }
        
        return arr;
    }
    
    public void addRole(Role role, UrlPath u ) throws Exception{
        int n =0;
         Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
       
        
        ArrayList<UrlPatternForRole> arr = new ArrayList<>();//arraylist of url
        
        //sql statement
        String sql="insert into UrlPatternOfRole values (?,?,?,?)" ;
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(role.getRoleID()));
            statement.setString(2, role.getRoleName());
            statement.setString(3, u.getUrlPath());
            statement.setString(4, u.getPageName());
            //execute statement
           n= statement.executeUpdate();
            
         //return value of lesson array   
       
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        
    }
    
    public UrlPath getUbyurl(String urlPath) throws Exception{
        
        UrlPath u = new UrlPath();
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
        
        ArrayList<UrlPath> arr = new ArrayList<>();//arraylist of urlPatternforrole
        
        //sql statement
        String sql="SELECT * from URL_List where urlPath=?";
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, urlPath);
            //execute statement
            rs = statement.executeQuery();
            while(rs.next()) {
                
                String uPath = rs.getString("urlPath") ;
                String pageName = rs.getString("pageName");
                String pageDescription = rs.getString("pageDescription");
               
                 u = new UrlPath(urlPath, pageName, pageDescription);
             }
         
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return u;
    }
    public void deleteRole(int r, String u ) throws Exception{
        int n =0;
         Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
       
        
        ArrayList<UrlPatternForRole> arr = new ArrayList<>();//arraylist of url
        
        //sql statement
        String sql="  delete from [SWP].[dbo].[UrlPatternOfRole] where roleID=? and urlPattern=?" ;
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, r);
           
            statement.setString(2, u);
            
            //execute statement
           n= statement.executeUpdate();
            
         //return value of lesson array   
       
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        
    }
    
    
    
//    public static void main(String[] args) throws Exception {
//        SettingDetailsDAOImpl addd= new SettingDetailsDAOImpl();
//       addd.deleteRole(3, "/UserProfileController");
//        
//    }
    
}
