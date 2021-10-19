/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Lesson;
import dao.BaseDao;
import dao.LessonDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class LessonDaoImpl extends BaseDao implements LessonDAO {

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lesson getOne(int id) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "SELECT * FROM [dbo].[Lesson]"
                    + " WHERE lessonID = ?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Lesson result = new Lesson();
                result.setLessonID(id);
                result.setContent(rs.getString("content"));
                result.setLessonType(rs.getString("lessonType"));
                result.setLessonName(rs.getString("lessonName"));
                result.setYoutubeLink(rs.getString("youtubeLink"));
                result.setContent(rs.getString("content"));
                result.setStatus(rs.getString("status"));
                return result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void insert(Lesson lesson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Lesson lesson) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "UPDATE [dbo].[Lesson]"
                    + " SET "
                    + " lessonType = ?"
                    + "\t,lessonName = ?"
                    + "\t,youtubeLink = ?"
                    + "\t,content = ? "
                    + "\t,status = ?"
                    + "\t,subjectID = ?"
                    + "\tWHERE lessonID = ?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, lesson.getLessonType());
            stm.setString(++index, lesson.getLessonName());
            stm.setString(++index, lesson.getYoutubeLink());
            stm.setString(++index, lesson.getContent());
            stm.setString(++index, lesson.getStatus());
            stm.setString(++index, lesson.getSubjectID());
            stm.setInt(++index, lesson.getLessonID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LessonDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
