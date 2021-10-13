/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-10    1.0        Mai           First Version<br>
 */
package dao.impl;
import context.DBContext;
import bean.Lesson;
import bean.Subject;
import dao.LessonDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class implements from class interface LessonDAO. <br>
 * This class contains method to query select data from the table
 * Information.<br>
 * There are get all Information.
 *
 * @author Mai
 */
public class GetLessonsDAOImpl extends DBContext implements LessonDAO{

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
     * Get a  get All Lesson
     * @param string sid
     * @return an array list of Lessons
     * @throws Exception
     */
    @Override
    public ArrayList<Lesson> getAllLessonBySID(String sid) throws Exception {
       
       Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<Lesson> arr = new ArrayList<>();
        String sql="SELECT * from Lesson where subjectID=?";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try { 
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, sid);
            rs = statement.executeQuery();
            while(rs.next()) {
                int lessonID = rs.getInt(1); 
                String lessonType = rs.getString(2);
                String lessonName = rs.getString(3);
                String youtubeLink = rs.getString(4);
                String content = rs.getString(5); 
                String status = rs.getString(6);
                String subjectID = rs.getString(7); 
                Lesson s = new Lesson(lessonID, lessonType, lessonName, youtubeLink, content, status, subjectID);
                arr.add(s);
             }
            
         return arr;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        
    }
    public static void main(String[] args) {
        GetLessonsDAOImpl a = new GetLessonsDAOImpl();
        try {
            System.out.println(a.getALessonByID(1));
        } catch (Exception ex) {
            Logger.getLogger(GetLessonsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Lesson getALessonByID(int lessonID) throws Exception {
        
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        Lesson lesson = new Lesson();
        String sql=" SELECT TOP 1 [lessonID]\n" +
"      ,[lessonType]\n" +
"      ,[lessonName]\n" +
"      ,[youtubeLink]\n" +
"      ,[content]\n" +
"      ,[status]\n" +
"      ,[subjectID] from Lesson where lessonID=?";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try { 
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, lessonID);
            rs = statement.executeQuery();
            while(rs.next()) {
                int lessonId = rs.getInt(1); 
                String lessonType = rs.getString(2);
                String lessonName = rs.getString(3);
                String youtubeLink = rs.getString(4);
                String content = rs.getString(5); 
                String status = rs.getString(6);
                String subjectID = rs.getString(7); 
                lesson= new Lesson(lessonId, lessonType, lessonName, youtubeLink, content, status, subjectID);
                
             }
            
         return lesson;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }

    @Override
    public Lesson getFirstLesson(String sid) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        Lesson lesson = new Lesson();
        String sql="SELECT TOP 1 [lessonID]\n" +
"      ,[lessonType]\n" +
"      ,[lessonName]\n" +
"      ,[youtubeLink]\n" +
"      ,[content]\n" +
"      ,[status]\n" +
"      ,[subjectID] from [SWP].[dbo].[Lesson] where subjectID=?";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try { 
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, sid);
            rs = statement.executeQuery();
            while(rs.next()) {
                int lessonId = rs.getInt(1); 
                String lessonType = rs.getString(2);
                String lessonName = rs.getString(3);
                String youtubeLink = rs.getString(4);
                String content = rs.getString(5); 
                String status = rs.getString(6);
                String subjectID = rs.getString(7); 
                lesson= new Lesson(lessonId, lessonType, lessonName, youtubeLink, content, status, subjectID);
                
             }
            
         return lesson;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }
    
}
