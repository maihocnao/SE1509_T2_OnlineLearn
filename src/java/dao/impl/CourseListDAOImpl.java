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
import bean.Subject;
import context.DBContext;
import dao.SubjectDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseListDAOImpl extends DBContext implements SubjectDAO {    
    /**
     * Get all subject from database
     *
     * @return an array list of subject
     * @throws Exception
     */
    @Override
    public ArrayList<Subject> listAllSubject() throws Exception{
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<Subject> arr = new ArrayList<>();
        String sql = "SELECT *FROM [SWP].[dbo].[Subject]";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            //statement.setString(1, sID);
            rs = statement.executeQuery();
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
        }finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        System.out.println(arr);
        return arr;
    }
    
    
    public static void main(String[] args) {
        CourseListDAOImpl a = new CourseListDAOImpl();
        try {
            a.listAllSubject();
        } catch (Exception ex) {
            Logger.getLogger(CourseListDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Subject> get6ToHp() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Subject subjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }
