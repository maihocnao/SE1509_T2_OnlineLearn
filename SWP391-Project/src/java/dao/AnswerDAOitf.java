/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.Answer;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import javax.jms.JMSException;
import util.DBConnection;

package dao;

/**
 *
 * @author phong
 */
public interface AnswerDAOitf {
   private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public AnswerDAO() {
    }

    private void closeConnection() throws SQLException, JMSException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }
    public ArrayList<Answer> getAllAnswer() throws SQLException, JMSException {
        ArrayList<Answer> answerList = new ArrayList<>();
        String sql = "select answerID, answer.questionID, result, answer.content from answer";                  
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(AnswerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    
    }
            }
        return null;           
    }
               
    public ArrayList<Answer> getAllCorrectAnswer() throws SQLException {
        ArrayList<Answer> correctList = new ArrayList<>();
        String sql = "select answerID, answer.questionID, result, answer.content from answer where result =1;";
        return correctList;
    }
               
    public List<Answer> getAnswerByQuestionID(int questionID) throws SQLException {
        List<Answer> list = new ArrayList<>();
        String sql = "select * from answer where questionID = ?;";               
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(AnswerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, questionID);
                rs = ps.executeQuery();

                while (rs.next()) {
                    
                }
            }
        return null;
    }    
               
               
    
}