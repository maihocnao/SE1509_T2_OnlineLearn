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
import dao.LessonDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * This class implements from class interface LessonDAO. <br>
 * This class contains method to query select data from the table
 * Lesson.<br>
 * There are get all Information, a list of lesson by subjectID, a lesson by lessonID
 *
 * @author Mai
 */
public class GetLessonsDAOImpl extends DBContext implements LessonDAO{

    
    /**
     * Get a  get All Lesson
     * @param sid is a string
     * @return an array list of Lessons
     * @throws Exception
     */
    @Override
    public ArrayList<Lesson> getAllLessonBySID(String sid) throws Exception {
       
        Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
        
        ArrayList<Lesson> arr = new ArrayList<>();//arraylist of lesson
        //sql statement
        String sql="SELECT * from Lesson where subjectID=?";
   
        //try catch to get result from database
        try { 
            //get connection
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, sid);
            //execute statement
            rs = statement.executeQuery();
            while(rs.next()) {
                int lessonID = rs.getInt(1); //indentation lesson id
                String lessonType = rs.getString(2); //String type of lesson
                String lessonName = rs.getString(3); // String Name of lesson 
                String youtubeLink = rs.getString(4);//link youtube
                String content = rs.getString(5); //content of lesson
                String status = rs.getString(6); //string status of lesson
                String subjectID = rs.getString(7); //string id of subject of lesson
                Lesson s = new Lesson(lessonID, lessonType, lessonName, youtubeLink, content, status, subjectID);//push to object s
                arr.add(s);//add to array
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
   
    /**
     * Get First Lesson option according in the database
     *
     * @param lessonID it is an int
     * @return a list <code>Lesson</code> object
     * @throws Exception
     */
    public Lesson getALessonByID(int lessonID) throws Exception {
        
          
       Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
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
                int lessonId = rs.getInt(1); //indentation lesson id
                String lessonType = rs.getString(2); //String type of lesson
                String lessonName = rs.getString(3); // String Name of lesson 
                String youtubeLink = rs.getString(4);//link youtube
                String content = rs.getString(5); //content of lesson
                String status = rs.getString(6); //string status of lesson
                String subjectID = rs.getString(7); //string id of subject of lesson
                lesson= new Lesson(lessonId, lessonType, lessonName, youtubeLink, content, status, subjectID); //push to object lesson
                
             }
         //return a object lesson   
         return lesson;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }

    /**
     * Get  A Lesson options according in the database
     *
     * @param sid it is a string
     * @return a list <code>Lesson</code> object
     * @throws Exception
     */
    @Override
    public Lesson getFirstLesson(String sid) throws Exception {
           
       Connection conn = null; //connection from db
        PreparedStatement statement = null; //statement to execute and user var
        ResultSet rs = null; // resultset to get result
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
                int lessonId = rs.getInt(1); //indentation lesson id
                String lessonType = rs.getString(2); //String type of lesson
                String lessonName = rs.getString(3); // String Name of lesson 
                String youtubeLink = rs.getString(4);//link youtube
                String content = rs.getString(5); //content of lesson
                String status = rs.getString(6); //string status of lesson
                String subjectID = rs.getString(7); //string id of subject of lesson
                lesson= new Lesson(lessonId, lessonType, lessonName, youtubeLink, content, status, subjectID); //push to object lesson
                
             }
            
         return lesson;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
           //close rs, statement, connection
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }
    
}
