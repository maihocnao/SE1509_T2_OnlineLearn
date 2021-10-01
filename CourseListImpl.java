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

public class CourseListImpl implements SubjectDAO {
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public CourseListImpl(DBConnect dbconn)  {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    /**
     * Get all subject from database
     *
     * @return an array list of subject
     * @throws Exception
     */
    
    @Override
    public ArrayList<Subject> listAllSubject() {
        ArrayList<Subject> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("SELECT *FROM [SWP].[dbo].[Subject]");
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
    }
