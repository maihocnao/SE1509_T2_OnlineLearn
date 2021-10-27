/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Question;
import bean.Quiz;
import dao.BaseDao;
import dao.QuizDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class QuizDaoImpl extends BaseDao implements QuizDAO {

    @Override
    public void addQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Quiz getQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Quiz quiz) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String sql = "INSERT INTO "
                + "[dbo].[Quiz](quizID, lessonID, level, numOfQuestion, duration, passRate, userID, submit_duration, score)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";

        Connection conn = getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, quiz.getQuizID());
            stm.setString(++index, quiz.getLessonID());
            stm.setString(++index, quiz.getLevel());
            stm.setInt(++index, quiz.getNumOfQuestion());
            stm.setInt(++index, quiz.getDuration());
            stm.setFloat(++index, quiz.getPassRate());
            stm.setInt(++index, quiz.getUserId());
            stm.setInt(++index, quiz.getSubmitDuration());
            stm.setFloat(++index, quiz.getScore());
            stm.executeUpdate();
            //insert vao quiz question 
            insertQuizQuestion(quiz);
        } catch (SQLException ex) {
            Logger.getLogger(QuizDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void insertQuizQuestion(Quiz data) {
        String sql = "INSERT INTO [dbo].[quiz.question](quiz_id, question_id,user_answ)"
                + " VALUES(?,? ,?)";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);
            for (Question x : data.getQuestions()) {
                stm.setString(1, data.getQuizID());
                stm.setInt(2, x.getQuestionID());
                stm.setInt(3, x.getUserAnswer());
                stm.addBatch();
            }
            stm.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(QuizDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(conn);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(QuizDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
