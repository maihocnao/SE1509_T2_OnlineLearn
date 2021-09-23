/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.Slider;
import bean.Subject;
import dao.DBConnect;
import dao.itf.SubjectDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public class get6SubjectHP implements SubjectDAO{
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public get6SubjectHP(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<Subject> get6ToHp(){ 
        ArrayList<Subject> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("SELECT TOP 6 [subjectID],[categoryID] ,[thumbnail],[name],[Description]FROM [SWP].[dbo].[Subject]");
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try {
            while(rs.next()) {
                 int subjectID=rs.getInt(1);
                int categoryID=rs.getInt(2);
                String thumbnail=rs.getString(3);
               
                String name=rs.getString(4);
                String des = rs.getString(5);
                Subject subject = new Subject(subjectID, categoryID, thumbnail, name, des);
                
                arr.add(subject);
            }
        } catch (SQLException ex) {
            
        }
        System.out.println(arr);
        return arr;
    }
    
    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        get6SubjectHP a = new get6SubjectHP(dbconn);
        a.get6ToHp();
    }
    
}
