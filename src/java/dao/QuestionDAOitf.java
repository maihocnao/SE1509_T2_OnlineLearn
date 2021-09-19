/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bean.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Viettech88.vn
 */
public interface QuestionDAOitf {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    private void closeConnection() throws SQLException {
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

    public ArrayList<Question> getQuestionbyQuizID(int id) throws SQLException{ 

    }

    public ArrayList<Question> getQuestionbyQuizID(int id) throws SQLException {

    }

    public List<Question> getQuestionPaging(int index) throws SQLException {

    }

    public int getTotal() throws SQLException {

    }

    public int getCountSearch(String txt) throws Exception {

    }

    public List<Question> getQuestionPaging(int index, String txt) throws SQLException {

    }

    public boolean addQuestion(int quizID, String content) throws SQLException {

    }

    public Question getQuestion(int questionID) throws SQLException {
        
    }

    public boolean editQuestion(int questionID, String content) throws SQLException {
        
    }

    public boolean deleteQuestion(int questionID) throws SQLException {
        
    }

    public List<Question> getQuestionID() throws SQLException{
       
    }
}
