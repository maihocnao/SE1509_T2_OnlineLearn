/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        Mai           First Version<br>
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

public class Get6SubjectHP implements SubjectDAO{
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public Get6SubjectHP(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    /**
     * Get a 6 SUbject to homepage
     *
     * @return an array list of subject
     * @throws Exception
     */
    public ArrayList<Subject> get6ToHp(){ 
        ArrayList<Subject> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("SELECT TOP 6 [subjectID],[categoryID],[thumbnail],[name],[Description],[status],[featured]FROM [SWP].[dbo].[Subject]");
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try {
            while(rs.next()) {
               
                 String subjectID = rs.getString(1);
                int categoryID=rs.getInt(2);
                String thumbnail=rs.getString(3);               
                String name=rs.getString(4);
                String des = rs.getString(5);
                String status = rs.getString(6);
                String ft = rs.getString(7);
                Subject subject = new Subject(subjectID, categoryID, thumbnail, name, des, status, ft);
                
                arr.add(subject);
            }
        } catch (SQLException ex) {
            
        }
        System.out.println(arr);
        return arr;
    }
    
    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        Get6SubjectHP a = new Get6SubjectHP(dbconn);
        a.get6ToHp();
    }

    @Override
    public ArrayList<Subject> listAllSubject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
