/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Question;
import bean.Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBConnection;
/**
 *
 * @author Viettech88.vn
 */
public interface QuizDAOitf {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public QuizDAOitf() {
    }

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
  
  public Quiz getQuizbyID(int id) throws SQLException
    {
        
    }
    


    public ArrayList<Quiz> getQuizByName(String keyword) throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizByNamePaginated(String keyword, int start, int total) throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizBySubject(String keyword) throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizBySubjectPaginated(String keyword, int start, int total) throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizByType(String keyword) throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizByTypePaginated(String keyword, int start, int total) throws SQLException {
        
    }

    public ArrayList<String> getQuizType() throws SQLException {
        
    }

    public Quiz getQuizbyID1(int id) throws SQLException {
        
    }

    public ArrayList<Quiz> getAllQuizByLessonID(int lessonID) throws SQLException {
        
    }

    public ArrayList<Quiz> getAllQuiz() throws SQLException {
        
    }

    public ArrayList<Quiz> getQuizPaginated(int start, int total) throws SQLException {
        
    }

    public void uncheckFK() throws SQLException {
        
    }

    public void checkFK() throws SQLException {
        
    }

    public int deleteQuizByID(int quizID) throws SQLException {
        
    }

    protected int getNumOfQuestion(int quizID) throws SQLException {
        
    }

    public int updateQuizInfo(int quizID, int lessonID, String quizName, String level, int duration, float passRate, String quizType) throws SQLException {
        
    }

    public int addQuiz(int lessonID, String quizName, String level, int duration, float passRate, String quizType) throws SQLException {
        
    }
    
    public List<Quiz> getQuizName() throws SQLException{
        
    }
}
