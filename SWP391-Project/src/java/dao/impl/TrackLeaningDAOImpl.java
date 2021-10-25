/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-15    1.0        Mai           First Version<br>
 */
package dao.impl;
import dao.TrackLearningDAO;
import bean.TrackLearning;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * This class contains methods to help us manipulate TrackLearning objects in the
 * database.
 *
 * @author Mai
 */
public class TrackLeaningDAOImpl extends DBContext implements TrackLearningDAO {
    /**
     * Get lessonID of TrackLearning  object according in the database
     *
     * @param userID it is an integer
     * @param subjectID it is a String
     * @return a integer <code>lessonID</code> attribute
     * @throws Exception
     */
    @Override
    public int getCurrentLessonID(int userID, String subjectID) throws Exception {
       Connection connect = null;
       PreparedStatement ps = null;
       ResultSet rs = null;
       int lessonID =0;       
       String sql = "Select * FROM [SWP].[dbo].[TrackLearning] where userID=? and subjectID=?" ;
       try{
           connect = getConnection();
           ps = connect.prepareStatement(sql);
           ps.setInt(1, userID);
           ps.setString(2, subjectID);
           rs = ps.executeQuery();
           while(rs.next()){
               lessonID = rs.getInt("lessonID");
           }
       }catch(Exception e){
           
       }
       finally{
           closeResultSet(rs);
           closePreparedStatement(ps);
           closeConnection(connect);
       }
       return lessonID;
      
       
       
    }
    /**
     * Update lessonID of TrackLearning  object according in the database
     *
     * @param userID it is an integer
     * @param subjectID it is a String
     * @param lessonID it is an integer
     * @return nothing, only update in database
     * @throws Exception
     */

    @Override
    public void updateCurrentLesson(int userID, String subjectID, int lessonID) throws Exception {
        Connection connect = null;
       PreparedStatement ps = null;
       ResultSet rs = null;
              
       String sql = "  update [SWP].[dbo].[TrackLearning] set lessonID=? where userID=? and subjectID=?" ;
       try{
           connect = getConnection();
           ps = connect.prepareStatement(sql);
           ps.setInt(1, lessonID);
           ps.setInt(2, userID);
           ps.setString(3, subjectID);
           rs = ps.executeQuery();
//           while(rs.next()){
//               
//           System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
//               lessonID = rs.getInt("lessonID");
//           }
       }catch(Exception e){
           
       }
       finally{
           closeResultSet(rs);
           closePreparedStatement(ps);
           closeConnection(connect);
       }
       
      
    }
    
}
