/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;

import bean.Quiz;
import dao.MyDAO;
import dao.QuizDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**This class contains methods to help us manipulate Quizz objects in the data base
 *
 * @author Hoang Anh
 */
public class QuizzesListDAOImpl extends MyDAO implements QuizDAO {
 /**
     * Get Quizzes of Quizzlist  object according in the database
     *
     * 
     * @return a list <code>allquiz</code> attribute
     * @throws Exception
     */
    
    
    public ArrayList<Quiz> getQuizzesList() {
        String sql = "Select * from [Quiz]";
        ArrayList<Quiz> allquiz = new ArrayList<>();
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    // query information in db
                    Quiz quiz = new Quiz();
                    quiz.setQuizID(rs.getInt(1));
                    quiz.setLessonID(rs.getInt(2));
                    quiz.setQuizName(rs.getString(3));
                    quiz.setLevel(rs.getString(4));
                    quiz.setNumOfQuestion(rs.getInt(5));
                    quiz.setDuration(rs.getInt(6));
                    quiz.setPassRate(rs.getFloat(7));
                    quiz.setQuizType(rs.getString(7));
        allquiz.add(quiz);
                }}
} catch (SQLException e) {
         
        }
    return allquiz;    
}

    public static void main(String[] args) {
        QuizzesListDAOImpl ql = new QuizzesListDAOImpl();
        System.out.println(ql.getQuizzesList());
    }
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
    }
    
