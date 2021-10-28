/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
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
        Connection conn = null;  //connection
        PreparedStatement statement = null; //preparestatement
        ResultSet rs = null; //result set
        //list of
        ArrayList<Subject> arr = new ArrayList<>();
        String sql = "SELECT *FROM [SWP].[dbo].[Subject]";
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

    @Override
    public ArrayList<Subject> getSubjectOfUser(int uID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSubject(String subjectid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }
